# Exercício 23
# Crie uma função chamada calcular_imc(peso, altura). 
# Fórmula: 
# IMC = peso / altura² 

def calcular_imc(peso, altura):
    # Validando limites físicos razoáveis
    if peso > 0 and peso < 600 and altura > 0.60 and altura < 2.60:
        return peso / (altura * altura)
    else: 
        return None

try:
    peso = float(input("Peso (kg): ").replace(',', '.'))
    altura = float(input("Altura (m): ").replace(',', '.'))
    
    imc = calcular_imc(peso, altura)

    if imc is None:
        print("Valores inseridos são irreais ou inválidos!")
    else:
        print(f"Seu IMC é {imc:.2f}")
        
        if imc < 18.5:
            print("Abaixo do peso")
        elif imc < 25:
            print("Peso ideal")
        elif imc < 30:
            print("Sobrepeso")
        elif imc < 35:
            print("Obesidade Grau I")
        elif imc < 40:
            print("Obesidade Grau II")
        else:
            print("Obesidade Grau III")
            
except ValueError:
    print("Por favor, digite apenas números.")