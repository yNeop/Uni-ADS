# Exercício 17
# Crie uma função chamada contar_letras(texto) que retorne a quantidade de caracteres.

def contar_letras(texto):
    return(len(texto))

palavra = input("Digite uma palavra: ")
print(f"{palavra} tem {contar_letras(palavra)} caracteres")