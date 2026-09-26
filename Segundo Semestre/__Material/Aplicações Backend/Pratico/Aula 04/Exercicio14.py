# Exercício 14
# Crie uma função chamada media(n1, n2, n3) que calcule a média de três números. 

def media(n1, n2, n3):
    return(n1 + n2 + n3) / 3
    
num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))
num3 = int(input("Digite o terceiro número: "))

print(f"{media(num1, num2, num3)} é a média desses números.")