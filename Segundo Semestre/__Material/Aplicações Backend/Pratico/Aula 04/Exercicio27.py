# Exercício 27
# Crie uma função chamada contar_pares(lista) que conte quantos números pares existem na lista. 

def contar_pares(lista):
    contador = 0
    for num in lista:
        if num % 2 == 0:
            contador += 1
    return contador

resultado = contar_pares([1, 2, 3, 4])
print(f"Quantidade de pares na lista: {resultado}")