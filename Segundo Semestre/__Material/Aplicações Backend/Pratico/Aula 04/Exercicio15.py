# Exercício 15
# Crie uma função chamada tabuada(numero) que mostre a tabuada de 1 a 10. 

def tabuada(numero):
    for i in range(1, 11):
        print(f"{numero} x {i} = {numero * i}")

num = int(input("Digite o valor para ver sua tabuada: "))

tabuada(num)