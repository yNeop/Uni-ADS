# Exercício 4 - Login simples
# Ler usuário e senha e exiba uma mensagem de sucesso se o usuário for igual a "admin" e senha for igual "123456"

user = "admin"
senha = 123456

tryLogin = input("Digite seu Usuario: ")
trySenha = int(input("Digite a senha: "))

if tryLogin == user and trySenha == senha:
    print("Logado com sucesso!")
else:
    print("Login ou senha incorreto(s)")

print("")