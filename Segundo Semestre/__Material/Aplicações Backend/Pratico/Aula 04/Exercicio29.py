# Exercício 29
# Crie uma função chamada verificar_aprovacao(nota) que mostre: 
# Nota Situação 
# >=7 Aprovado 
# >=5 Recuperação 
# <5 Reprovado 

def verificar_aprovacao(nota):
    if nota < 5:
        return "Reprovado"
    elif nota >= 5 and nota < 7:
        return "Recuperação"
    else:
        return "Aprovado"
    
nota = int(input("Digite sua nota: "))
print(f"Situação: {verificar_aprovacao(nota)}")