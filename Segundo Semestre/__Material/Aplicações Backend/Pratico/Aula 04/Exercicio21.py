# Exercício 21
# Crie uma função chamada calculadora(a, b, operacao) que execute: 
# + 
# - 
# * 
# / 

def calculadora(a, b, operacao):
    if operacao == "+":
        return a + b
    elif operacao == "-":
        return a - b
    elif operacao == "*":
        return a * b
    elif operacao == "/":
        if b == 0:
            return "Erro", "Divisão por zero"
        
        # // para pegar o quociente inteiro e % para o resto
        quociente = a // b
        resto = a % b
        return quociente, resto

num1 = int(input("Digite o valor de a: "))
tipo = input("\nSelecione tipo de equação: ")
num2 = int(input("\nDigite o valor de b: "))

if tipo == "/":
    resultado, resto = calculadora(num1, num2, "/")
    
    if resultado == "Erro":
        print(resto)
    else:
        print(f"{num1} / {num2} = {resultado}")
        print(f"Resto: {resto}")
else:
    # Para + - * a função retorna apenas um valor
    resultado = calculadora(num1, num2, tipo)
    print(f"{num1} {tipo} {num2} = {resultado}")