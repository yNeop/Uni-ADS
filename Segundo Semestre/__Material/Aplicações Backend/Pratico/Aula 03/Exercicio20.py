# Dicionario - 20

alunos_notas = {
    "Ana": 8,
    "Carlos": 7,
    "Maria": 9
}

# Percorrendo o dicionário para mostrar os dados
# .items() nos dá acesso tanto à chave (nome) quanto ao valor (nota)
for aluno, nota in alunos_notas.items():
    print(f"{aluno} - {nota}")