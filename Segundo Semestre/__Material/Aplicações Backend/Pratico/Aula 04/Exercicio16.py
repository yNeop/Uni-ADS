# Exercício 16
# Crie uma função chamada contador(inicio, fim) que mostre os números entre esses valores. 
# Exemplo: 
# contador(1,5) 
# Saída: 
# 1 
# 2 
# 3 
# 4 
# 5

def contador(inicio, fim):
    for i in range(inicio, fim + 1):
        print(i)
    
num1 = int(input("Digite o valor de inicio: "))
num2 = int(input("Digite o valor de fim: "))

contador(num1, num2)