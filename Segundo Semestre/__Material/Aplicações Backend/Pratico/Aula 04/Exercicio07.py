# Exercício 7
# Crie uma função chamada multiplicar(a, b) que retorne o produto de dois números.

def multiplicar(a, b):
    return a * b

num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

print(f"{num1} * {num2} = {multiplicar(num1, num2)}")