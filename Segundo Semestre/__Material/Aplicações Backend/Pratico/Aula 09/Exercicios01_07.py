from flask import Flask, jsonify

app = Flask (__name__)

# Exercício 1
@app.route('/boasvindas/<nome>')
def boasvindas(nome):
    return f'Olá, {nome}! Seja bem-vindo ao sistema.'

# Exercício 2
@app.route('/idade/<int:ano>')
def idade(ano):
    ano_atual = 2026
    idade = ano_atual - ano
    return f'Você tem {idade} anos.'

# Exercício 3
@app.route('/calcular/<int:a>/<int:b>')
def calc(a, b):
    soma = a + b
    subtracao = a - b
    multiplicacao = a * b
    return f'{a} + {b} = {soma}<br>{a} - {b} = {subtracao}<br>{a} * {b} = {multiplicacao}.'

# Exercício 4
@app.route('/numero/<int:n>')
def parimpar(n):
    if n % 2 == 0:
        return f'O número {n} é par.'
    else:
        return f'O número {n} é ímpar.'
   
# Exercício 5 
@app.route('/perfil/<nome>')
def criarjsoncomAPI(nome):
    return jsonify({
        'nome': nome,
        'mensagem': f'Ola, {nome}! Seja bem-vindo ao sistema.'
    })

# Exercício 6
@app.route('/frase/<nome>/<cidade>')
def frase(nome, cidade):
    return f'Olá {nome}, você mora em {cidade}!'

# Exercício 7
@app.route("/")
def inicio():
    return jsonify({
        'api': 'Mini API',
        'versao': '1.0',
        'endpoints': [
            '/home',
            '/status',
            '/usuario/<nome>',
            '/dobro/<int:n>'
        ]
    })

# Rota de home
@app.route("/home")
def home():
    return "Bem-vindo à Mini API!"

# Rota de status
@app.route("/status")
def status():
    return "API funcionando"

# Rota com parâmetro (nome)
@app.route("/usuario/<nome>")
def usuario(nome):
    return f"Olá, {nome}!"

# Rota com número inteiro
@app.route("/dobro/<int:n>")
def dobro(n):
    dobro = n * 2
    return f"O dobro de {n} é {dobro}."

if __name__ == "__main__":
    app.run(debug = True)