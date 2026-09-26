from game import Game

print("Vamos adicionar 5 Jogos no Banco de Dados!")
for i in range(5):
    nome = input("Digite o nome do jogo: ")
    genero = input("Digite o gênero do jogo: ")
    preco = input("Digite o preço do jogo: ")

    game = Game(nome, genero, preco)
    game.salvar()

buscar_nome = input("Digite o nome do jogo para buscar: ")
jogo = game.buscar_por_nome(buscar_nome)
if jogo:
    print("Jogo encontrado:", jogo)
else:
    print("Jogo não encontrado.")

buscar_todos = input("Deseja listar todos os jogos? (s/n): ")
if buscar_todos.lower() == 's':
    game.listar_todos()
else:    
    print("Listagem de jogos cancelada.")

buscar_genero = input("Digite o gênero do jogo para buscar: ")
game.buscar_por_genero(buscar_genero)

nome_alterar_dados = input("Digite o nome do jogo para alterar todos os dados: ")
jogo_alterar = game.buscar_por_nome(nome_alterar_dados)

if jogo_alterar:
    print("Jogo encontrado:", jogo_alterar)

    id_jogo = jogo_alterar[0]

    novo_nome = input("Digite o novo nome do jogo: ")
    novo_genero = input("Digite o novo gênero do jogo: ")
    novo_preco = float(input("Digite o novo preço do jogo: "))

    game.alterar(id_jogo, novo_nome, novo_genero, novo_preco)
    print("Dados atualizados com sucesso!")
else:
    print("Jogo não encontrado no banco de dados.")

nome_excluir = input("Digite o nome do jogo para excluir: ")
jogo_excluir = game.buscar_por_nome(nome_excluir)

if jogo_excluir:
    id_jogo = jogo_excluir[0]
    game.excluir(id_jogo)
    print("Jogo excluído com sucesso!")
else:
    print("Jogo não encontrado no banco de dados.")