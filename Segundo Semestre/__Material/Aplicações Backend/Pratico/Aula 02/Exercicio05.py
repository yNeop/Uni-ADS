# Exercício 5 - Tabuada
# Ler um numero e exibir a tabuada do numero lido

num = int(input("Digite um número: "))

for i in range(1, 11):
    print(num, "x", i, "=", num * i)

print("")