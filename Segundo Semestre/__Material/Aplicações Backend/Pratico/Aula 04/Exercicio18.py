# Exercício 18
# Crie uma função chamada area_retangulo(base, altura) que retorne a área.

def area_retangulo(base, altura):
    return base * altura

num1 = int(input("Digite o valor da base: "))
num2 = int(input("Digite o valor da altura: "))

print(f"A area desse retângulo é de {area_retangulo(num1, num2)}cm²")