from conexao import conectar

class Produto:

    def __init__(self, nome, preco, estoque):
        self.nome = nome
        self.preco = preco
        self.estoque = estoque

    def salvar(self):
        conexao = conectar()
        print("Conexão com banco de dados foi feita com sucesso.")
        cursor = conexao.cursor()

        # Pode ser tudo String mesmo sendo DECIMAL e INT
        
        sql = "INSERT INTO produtos (nome, preco, estoque) VALUES (%s, %s, %s)"
        valores = (self.nome, self.preco, self.estoque)

        cursor.execute(sql, valores)
        conexao.commit()

        print("Produto cadastrado com sucesso no banco de dados!")

        cursor.close()
        conexao.close()