# Exercício 20
# Crie uma função chamada apresentar(nome="Visitante") que mostre uma saudação com valor padrão.

def apresentar(nome = "Visitante"):
    print(f"Olá, {nome}! Seja bem-vindo(a).")

nome_usuario = input("Digite o seu nome (ou aperte Enter para pular): ")

if nome_usuario.strip() == "":
    # Se estiver vazio, chamamos a função sem argumentos para usar o padrão
    apresentar()
else:
    # Se houver um nome, passamos ele para a função
    apresentar(nome_usuario)