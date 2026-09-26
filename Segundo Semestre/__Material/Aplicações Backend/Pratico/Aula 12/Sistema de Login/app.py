from flask import Flask
from controller.usuario_controller import tela_login, login, tela_cadastro, cadastrar, home, logout, trocar_senha, recuperar_senha, redefinir_senha
import secrets

app = Flask(__name__)

# app.secret_key = "123456789"
app.secret_key = secrets.token_urlsafe(32)

# Tela de Login
app.add_url_rule('/',view_func=tela_login)

# Processar o Login
app.add_url_rule('/login',view_func=login,methods=['POST'])

# Tela de Cadastro
app.add_url_rule('/cadastro',view_func=tela_cadastro)

# Salvar o Cadastro
app.add_url_rule('/cadastrar',view_func=cadastrar, methods=['POST'])

# Tela de Alterar Senha
app.add_url_rule('/trocar_senha',view_func=trocar_senha, methods=['GET', 'POST'])

app.add_url_rule('/recuperar_senha',view_func=recuperar_senha, methods=['GET', 'POST'])

app.add_url_rule('/redefinir_senha/<token>',view_func=redefinir_senha, methods=['GET', 'POST'])

# Home
app.add_url_rule('/home',view_func=home)

# Logout
app.add_url_rule('/logout',view_func=logout)

if __name__ == "__main__":
    app.run(debug=True)