from cliente import Cliente
from produto import Produto

nome = input("Digite um nome: ")
email = input("Digite um email: ")

nomep = input("Digite o nome do produto: ")
preco = input("Digite o preço: ")
estoque = input("Digite o estoque: ")

cliente = Cliente(nome, email)
cliente.salvar()
cliente.alterar_dados()
cliente.listar_todos()
cliente.excluir()

# Ele não separa astring do Cliente e do Produto, nomes precisam ser diferentes

produto = Produto(nomep, preco, estoque)
produto.salvar()