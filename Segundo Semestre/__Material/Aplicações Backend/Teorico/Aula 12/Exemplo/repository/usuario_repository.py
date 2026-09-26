from config.database import conectar

class UsuarioRepository:

    def salvar(self, usuario):
        conexao = conectar()
        try:
            cursor = conexao.cursor()
            sql = """
                INSERT INTO usuarios
                (nome,email,senha)
                VALUES(%s,%s,%s)
            """
            cursor.execute(
                sql,
                (
                    usuario.nome,
                    usuario.email,
                    usuario.senha
                )
            )

            conexao.commit()
        finally:
            cursor.close()
            conexao.close()


    def buscar_por_email(self, email):
        conexao = conectar()
        try:
            cursor = conexao.cursor(dictionary=True)
            sql = """
                SELECT *
                FROM usuarios
                WHERE email=%s
            """
            cursor.execute(sql, (email,))
            usuario = cursor.fetchone()
            return usuario
        finally:
            cursor.close()
            conexao.close()

