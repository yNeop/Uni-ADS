# Exercício 8 - Ler um número e informar se o número é primo

numero = int(input("Digite um número: "))

if numero < 2:
    print("O número não é primo.")
else:
    primo = True

    for i in range(2, numero):
        if numero % i == 0:
            primo = False
            break

    if primo:
        print("O número é primo.")
    else:
        print("O número não é primo.")