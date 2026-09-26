# Exercício 6
# Crie uma função chamada subtrair(a, b) que retorne a diferença entre dois números.

def subtrair(a, b):
    return a - b

num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

print(f"{num1} - {num2} = {subtrair(num1, num2)}")