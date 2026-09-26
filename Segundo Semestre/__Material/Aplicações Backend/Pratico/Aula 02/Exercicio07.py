# Exercício 7 - Ler uma palavra e exibir quantas vogais ela tem

palavra = input("Digite uma palavra: ")
cont = 0

for vogais in palavra:
    if vogais.lower() in "aeiou":
        cont += 1

print("Quantidade de vogais:", cont)

print("")