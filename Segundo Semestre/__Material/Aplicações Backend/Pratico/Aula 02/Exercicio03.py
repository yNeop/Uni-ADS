# Exercício 3 - Ler 3 números e exibir o maior deles

num1 = int(input("Digite o 1º número: "))
num2 = int(input("Digite o 2º número: "))
num3 = int(input("Digite o 3º número: "))

if num1 > num2 and num1 > num3:
    print("Maior =", num1)
elif num2 > num1 and num2 > num3:
    print("Maior =", num2)
else:
    print("Maior =", num3)

print("")