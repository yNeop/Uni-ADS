# Exercício 10 - Validação de entrada
# Peça ao usuário para digitar um numero positivo se o usuário digitar um numero negativo ou zero, continue 
# pedindo o numero até que o numero digitado seja validado como positivo

numero = int(input("Digite um número positivo: "))

while numero <= 0:
    print("\nNúmero inválido.")
    numero = int(input("Digite um número positivo: "))

print(f"Número válido digitado: {numero}")