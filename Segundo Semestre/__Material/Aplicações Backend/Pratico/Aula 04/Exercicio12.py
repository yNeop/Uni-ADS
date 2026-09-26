# Exercício 12
# Crie uma função chamada maior_numero(a, b) que retorne o maior número. 

def maior_numero(a, b):
    if (a > b):
        return(a)
    else:
        return(b)
    
num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

print(f"{maior_numero(num1, num2)} é o maior número.")