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
            
    def atualizar_senha(self, usuario_id, nova_senha_criptografada):
        conexao = conectar()

        try:
            cursor = conexao.cursor()

            sql = """
                UPDATE usuarios
                SET senha = %s
                WHERE id = %s
                """

            cursor.execute(
                sql,
                (
                    nova_senha_criptografada,
                    usuario_id
                )
            )

            conexao.commit()

        finally:
            cursor.close()
            conexao.close()
    
    def salvar_token(self, email, token, expiracao):
        conexao = conectar()

        try:
            cursor = conexao.cursor()

            sql = """
            UPDATE usuarios
            SET token_recuperacao=%s,
            token_expiracao=%s
            WHERE email=%s
            """

            cursor.execute(
                sql,
                (token, expiracao, email)
            )

            conexao.commit()

        finally:
            cursor.close()
            conexao.close()
        
    def buscar_por_token(self, token):
        conexao = conectar()

        try:
            cursor = conexao.cursor(dictionary=True)

            sql = """
            SELECT *
            FROM usuarios
            WHERE token_recuperacao=%s
            """

            cursor.execute(sql, (token,))
            return cursor.fetchone()

        finally:
            cursor.close()
            conexao.close()
        
    def limpar_token(self, usuario_id):
        conexao = conectar()

        try:
            cursor = conexao.cursor()

            sql = """
            UPDATE usuarios
            SET token_recuperacao = NULL,
            token_expiracao = NULL
            WHERE id = %s
            """

            cursor.execute(sql, (usuario_id,))
            conexao.commit()

        finally:
            cursor.close()
            conexao.close()