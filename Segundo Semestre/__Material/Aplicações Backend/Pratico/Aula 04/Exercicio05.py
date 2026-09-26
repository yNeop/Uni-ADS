# Exercício 5
# Crie uma função chamada soma(a, b) que retorne a soma de dois números.

def soma(a, b):
    return a + b

num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

print(f"{num1} + {num2} = {soma(num1, num2)}")