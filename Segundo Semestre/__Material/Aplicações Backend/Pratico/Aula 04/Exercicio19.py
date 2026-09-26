# Exercício 19
# Crie uma função chamada area_circulo(raio). 
# Fórmula: 
# area = π × raio²

def area_circulo(raio):
    return 3.1415 * (raio * raio)

num = int(input("Digite o valor do raio: "))
print(f"π × {num}² = {area_circulo(num):.2f}cm²")