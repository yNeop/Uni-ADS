# Exercício 9 - Declarar duas variáveis inteiras
# Criar um menu com a opções para operações 
# 1 - somar
# 2 - subtrair
# 3 - multiplicar
# 4 - dividir
# 5 - sair 
# o programa deverá encerrar quando for digitado a opção 5 - sair

# Declarando duas variáveis inteiras
num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

while True:
    print("\n===== MENU =====")
    print("1 - Somar")
    print("2 - Subtrair")
    print("3 - Multiplicar")
    print("4 - Dividir")
    print("5 - Sair")

    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        resultado = num1 + num2
        print(f"Resultado da soma: {resultado}")

    elif opcao == 2:
        resultado = num1 - num2
        print(f"Resultado da subtração: {resultado}")

    elif opcao == 3:
        resultado = num1 * num2
        print(f"Resultado da multiplicação: {resultado}")

    elif opcao == 4:
        if num2 != 0:
            resultado = num1 / num2
            print(f"Resultado da divisão: {resultado}")
        else:
            print("Não é possível dividir por zero.")

    elif opcao == 5:
        print("Programa encerrado.")
        break

    else:
        print("Opção inválida. Tente novamente.")