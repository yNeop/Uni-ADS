from config.database import conectar
from models.cliente import Cliente
class ClienteRepository:

    def listar_todos(self):
        conexao = conectar()
        cursor = conexao.cursor()

        cursor.execute("SELECT * FROM clientes")
        resultados = cursor.fetchall()

        clientes = []
        for row in resultados:
            clientes.append(Cliente(row[0], row[1], row[2]))

        cursor.close()
        conexao.close()

        return clientes

    def buscar_por_id(self, id):
        conexao = conectar()
        cursor = conexao.cursor()

        cursor.execute("SELECT * FROM clientes WHERE id=%s", (id,))
        resultado = cursor.fetchone()

        cursor.close()
        conexao.close()

        if resultado:
            return Cliente(resultado[0], resultado[1], resultado[2])
        return None
    
