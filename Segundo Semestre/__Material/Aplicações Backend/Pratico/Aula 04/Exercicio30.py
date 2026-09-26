# Exercício 30
# Crie um mini sistema de aluno usando funções: 
# Funções: 
# ler_notas() 
# calcular_media() 
# verificar_situacao() 
# Saída esperada: 
# Média: 6.5 
# Situação: Recuperação

def ler_notas():
    av1 = float(input("Digite a nota da AV1: "))

    while av1 < 0:
        av1 = float(input("\nDigite uma nota válida para AV1: "))
    
    av2 = float(input("Digite a nota da AV2: "))
    
    while av2 < 0:
        av2 = float(input("\nDigite uma nota válida para AV2: "))

    return av1, av2

def calcular_media(av1, av2):
    return (av1 + av2) / 2

def verificar_situacao(media):
    if media < 5:
        return "Reprovado"
    elif media >= 5 and media < 7:
        return "Recuperação"
    else:
        return "Aprovado"

av1, av2 = ler_notas()
media = calcular_media(av1, av2)
situacao = verificar_situacao(media)

print(f"Média: {media}")
print(f"Situação: {situacao}")