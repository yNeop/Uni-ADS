# Exercício 8
# Crie uma função chamada dividir(a, b) que retorne a divisão entre dois números.

def dividir(a, b):
    return a / b

# BONUS! RESTO

def resto(a, b):
    return a % b

num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

print(f"{num1} / {num2} = {dividir(num1, num2)}")
print(f"E o resto é = {resto(num1, num2)}")