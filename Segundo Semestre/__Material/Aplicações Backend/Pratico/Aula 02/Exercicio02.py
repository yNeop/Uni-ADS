# Exercicio 02 - Ler numero e informar para cada numero do intervalo de 1 ao lido é
# PAR ou IMPAR
# EX: Número digitado: 5
# 1 IMPAR
# 2 PAR
# 3 IMPAR
# 4 PAR
# 5 IMPAR

num = int(input("Digite um número: "))

for i in range(1, num + 1):
    if i % 2 == 0:
        print(i, "PAR")
    else:
        print(i, "IMPAR")

print("")