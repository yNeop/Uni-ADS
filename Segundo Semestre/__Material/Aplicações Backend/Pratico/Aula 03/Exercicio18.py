# Dicionario - 18

carro1 = {
    "marca": "Vw",
    "modelo": "Fusca",
    "ano": 1970
}
carro2 = {
    "marca": "Fiat",
    "modelo": "Uno",
    "ano": 2020
}

def exer18imprimir(exer18carro):
    for chave, valor in exer18carro.items():
        print(f"{chave}: {valor}")

exer18imprimir(carro1)
print("")
exer18imprimir(carro2)