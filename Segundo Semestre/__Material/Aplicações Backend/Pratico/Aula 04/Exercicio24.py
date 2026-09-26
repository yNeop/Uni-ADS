# Exercício 24
# Crie uma função chamada temperatura(celsius) que converta para Fahrenheit. 
# Fórmula: 
# F = C * 1.8 + 32 

def temperatura(celsius):
    return celsius * 1.8 + 32

c = int(input("Digite o valor em celsius: "))

print(f"{c}° Celsius são equivalentes à {temperatura(c)}° Fahrenheit")