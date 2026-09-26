# Exercício 9
# Crie uma função chamada quadrado(numero) que retorne o quadrado do número.

def quadrado(numero):
    return numero * numero

num = int(input("Digite o número: "))

print(f"{num}² = {quadrado(num)}")