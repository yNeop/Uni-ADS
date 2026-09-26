# Exercício 22
# Crie uma função chamada verificar_idade(idade) que mostre: 
# • Menor de idade 
# • Maior de idade

def verificar_idade(idade):
    if(idade >= 18 and idade < 117):
        return "Maior de idade."
    elif(idade >= 4 and idade < 18):
        return "Menor de idade."
    else:
        return "Duvido!"
    
idade = int(input("Digite sua idade: "))
resultado = verificar_idade(idade)

if (resultado == "Duvido!"):
    print(f"{resultado} Impossível você ter {idade} anos.")
else:
    print(f"{resultado} Você tem {idade} anos.")