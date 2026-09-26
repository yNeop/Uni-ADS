# Exercício 6 - Ler um numero e exibir se o numero é positivo, negativo ou zero

num = int(input("Digite um número: "))

if num == 0:
    print("É ZERO")
elif num > 0:
    print("É Positivo")
else:
    print("É Negativo")