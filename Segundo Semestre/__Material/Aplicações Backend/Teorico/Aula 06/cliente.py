from conexao import conectar

class Cliente:

    def __init__(self, nome, email, id=None):
        self.nome = nome
        self.email = email
        self.id = id

    def salvar(self):
        conexao = conectar()
        print("Conexão com banco de dados foi feita com sucesso.")
        cursor = conexao.cursor()

        sql = "INSERT INTO clientes (nome, email) VALUES (%s, %s)"
        valores = (self.nome, self.email)

        cursor.execute(sql, valores)
        conexao.commit()

        print("Cliente cadastrado com sucesso no banco de dados!")

        cursor.close()
        conexao.close()
    
    def alterar_dados(self):
        conexao = conectar()
        cursor = conexao.cursor()
    
        if self.id is None:
            print("Erro: ID não informado")
            return

        sql = "UPDATE clientes SET nome = %s, email = %s WHERE id = %s"
        valores = (self.nome, self.email, self.id)

        cursor.execute(sql, valores)
        conexao.commit()

        print("Dados do cliente atualizados com sucesso!")

        cursor.close()
        conexao.close()
    
    def listar_todos(self):
        conexao = conectar()
        cursor = conexao.cursor()

        sql = "SELECT * FROM clientes"
        cursor.execute(sql)

        resultados = cursor.fetchall()

        for cliente in resultados:
            print(cliente)

        cursor.close()
        conexao.close()
        
    def excluir(self):
        conexao = conectar()
        cursor = conexao.cursor()
        
        if self.id is None:
            print("Erro: ID não informado")
            return
        
        sql = "DELETE FROM clientes WHERE ID = %S"
        cursor.execute(sql, (self.id))
        conexao.commit()
        
        print("Cliente exluido do banco de dados!!!")
        
        cursor.close()
        conexao.close()