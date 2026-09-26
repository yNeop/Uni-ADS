from conexao import conectar

class Game:

    def __init__(self, nome, genero, preco, id=None):
        self.id = id
        self.nome = nome
        self.genero = genero
        self.preco = preco

    def salvar(self):
        conexao = conectar()
        print("Conexão com banco de dados foi feita com sucesso.")
        cursor = conexao.cursor()
        
        sql = "INSERT INTO games (nome, genero, preco) VALUES (%s, %s, %s)"
        valores = (self.nome, self.genero, self.preco)

        cursor.execute(sql, valores)
        conexao.commit()

        print("Jogo cadastrado com sucesso no banco de dados!")

        cursor.close()
        conexao.close()
    
    def listar_todos(self):
        conexao = conectar()
        cursor = conexao.cursor()

        sql = "SELECT * FROM games"
        cursor.execute(sql)

        resultados = cursor.fetchall()

        for game in resultados:
            print(game)

        cursor.close()
        conexao.close()
        
    def buscar_por_nome(self, nome):
        conexao = conectar()
        cursor = conexao.cursor()
    
        sql = "SELECT * FROM games WHERE nome = %s"
        valor = (nome,)
        cursor.execute(sql, valor)
        resultado = cursor.fetchone()
    
        cursor.close()
        conexao.close()

        return resultado
    
    def buscar_por_genero(self, genero):
        conexao = conectar()
        cursor = conexao.cursor()
        
        sql = "SELECT * FROM games WHERE genero = %s"
        valor = (genero,)
        cursor.execute(sql, valor)
        resultados = cursor.fetchall()
        
        if resultados:
            print("Jogos encontrados:")
            for game in resultados:
                print(game)
        else:
            print("Nenhum jogo encontrado para o gênero:", genero)
        
        cursor.close()
        conexao.close()
    
    def alterar(self, id, novo_nome, novo_genero, novo_preco):
        conexao = conectar()
        cursor = conexao.cursor()

        sql = "UPDATE games SET nome = %s, genero = %s, preco = %s WHERE id = %s"
        valores = (novo_nome, novo_genero, novo_preco, id)

        cursor.execute(sql, valores)
        conexao.commit()

        print("Jogo atualizado com sucesso!")

        cursor.close()
        conexao.close()
    
    def excluir(self, id):
        conexao = conectar()
        cursor = conexao.cursor()

        sql = "DELETE FROM games WHERE id = %s"
        cursor.execute(sql, (id,))
        conexao.commit()
        cursor.close()
        conexao.close()