# Declaração de um dicionario em Python

aluno = {
    "nome": "Maria",
    "idade": 25,
    "altura": 1.68
}
print(aluno)
print("")

# Print de partes especificas

print("Nome do aluno:", aluno["nome"])
print("Tem", aluno["idade"], "anos")
print("")

# Adicionando informações "Curso"

aluno["nome"] = "Maria Helena"
aluno["curso"] = "Direito"
print("Nome do aluno:", aluno["nome"])
print("Tem", aluno["idade"], "anos e está cursando", aluno["curso"])
print("")

# Laço print dos valores

for chave, valor in aluno.items():
    print(valor)
print("")

#

alunos = [
    {"nome": "Ana", "nota": 8},
    {"nome": "Carlos", "nota": 6}
]

print("Lista dos aprovados:")
for aluno in alunos:
    if aluno["nota"] >= 7:
        print(aluno["nome"], "Aprovados!")
print("")