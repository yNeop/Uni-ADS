# Exercício 13
# Crie uma função chamada menor_numero(a, b) que retorne o menor número. 

def menor_numero(a, b):
    if (a < b):
        return(a)
    else:
        return(b)
    
num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

print(f"{menor_numero(num1, num2)} é o menor número.")