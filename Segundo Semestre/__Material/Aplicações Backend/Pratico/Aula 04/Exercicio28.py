# Exercício 28
# Crie uma função chamada tabuada_completa() que mostre todas as tabuadas de 1 até 10.

def tabuada(numero):
    for n in range(1, numero + 1):
        print(f"\n--- TABUADA DO {n} ---")
        
        for i in range(1, 11):
            print(f"{n} x {i} = {n * i}")

tabuada(10)

# Existem caminhos melhores, mas foi exigido que exibisse as tabuadas de 1 a 10 de forma direta!