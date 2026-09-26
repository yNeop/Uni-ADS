from datetime import datetime
import email, re

from flask import render_template,request,redirect,session,flash
from service.usuario_service import UsuarioService

service = UsuarioService()

def tela_login():
    return render_template("login.html")


def login():
    email = request.form["email"]
    senha = request.form["senha"]
    usuario = service.autenticar(email,senha)

    if usuario:
        session["usuario_id"] = usuario["id"]
        session["usuario_nome"] = usuario["nome"]
        return redirect("/home")
    flash("Usuário ou senha inválidos")
    return redirect("/")


def tela_cadastro():
    return render_template("cadastro.html")

def cadastrar():
    nome = request.form["nome"]
    email = request.form["email"]
    senha = request.form["senha"]

    if len(senha) < 8:
        flash("A senha deve ter pelo menos 8 caracteres.")
        return render_template("cadastro.html", nome=nome, email=email)

    if not re.search(r"[A-Z]", senha):
        flash("A senha deve conter pelo menos uma letra maiúscula.")
        return render_template("cadastro.html", nome=nome, email=email)

    if not re.search(r"[a-z]", senha):
        flash("A senha deve conter pelo menos uma letra minúscula.")
        return render_template("cadastro.html", nome=nome, email=email)

    if not re.search(r"\d", senha):
        flash("A senha deve conter pelo menos um número.")
        return render_template("cadastro.html", nome=nome, email=email)

    if not re.search(r"[!@#$%^&*(),.?\":{}|<>]", senha):
        flash("A senha deve conter pelo menos um símbolo.")
        return render_template("cadastro.html", nome=nome, email=email)

    service.cadastrar(nome, email, senha)

    flash("Usuário cadastrado com sucesso!")
    return redirect("/")

def trocar_senha():

    if "usuario_id" not in session:
        return redirect("/")

    if request.method == "GET":
        return render_template("trocar_senha.html")

    nova_senha = request.form["nova_senha"]
    confirmar_senha = request.form["confirmar_senha"]

    if nova_senha != confirmar_senha:
        flash("As senhas não coincidem!")
        return redirect("/trocar_senha")

    usuario_id = session["usuario_id"]

    try:
        service.trocar_senha(usuario_id, nova_senha)

        flash("Senha alterada com sucesso!")
        return redirect("/home")

    except Exception as e:
        print(e)
        flash("Erro ao alterar senha.")
        return redirect("/trocar_senha")

def home():
    if "usuario_id" not in session:
        return redirect("/")
    return render_template("home.html",nome=session["usuario_nome"])


def logout():
    session.clear()
    return redirect("/")

def recuperar_senha():

    if request.method == "GET":
        return render_template("recuperar_senha.html")

    email = request.form["email"]

    token = service.gerar_token_recuperacao(email)

    flash(
        f"Link gerado: http://127.0.0.1:5000/redefinir_senha/{token}"
    )

    return redirect("/recuperar_senha")

def redefinir_senha(token):

    usuario = service.repository.buscar_por_token(token)

    if not usuario:
        flash("Token inválido.")
        return redirect("/")

    if datetime.now() > usuario["token_expiracao"]:
        service.limpar_token(usuario["id"])

        flash("Token expirado.")
        return redirect("/")

    if request.method == "GET":
        return render_template("redefinir_senha.html")

    nova_senha = request.form["nova_senha"]
    confirmar_senha = request.form["confirmar_senha"]

    if nova_senha != confirmar_senha:
        flash("As senhas não coincidem.")
        return redirect(f"/redefinir_senha/{token}")

    service.trocar_senha(usuario["id"], nova_senha)

    service.limpar_token(usuario["id"])

    flash("Senha redefinida com sucesso!")

    return redirect("/")