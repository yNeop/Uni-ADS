# Exercício 11
# Crie uma função chamada par_ou_impar(numero) que mostre se o número é par ou ímpar.

def par_ou_impar(numero):
    if (numero % 2 == 0):
        return "PAR"
    else:
        return "IMPAR"

num = int(input("Digite um número: "))
print(f"O número que você digitou é {par_ou_impar(num)}")