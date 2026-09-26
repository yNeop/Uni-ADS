from config.database import get_db_connection
from mysql.connector import Error


class ClienteRepository:

    @staticmethod
    def fetch_all():
        connection = get_db_connection()
        if not connection:
            return None

        cursor = connection.cursor(dictionary=True)
        cursor.execute("SELECT * FROM pedidos ORDER BY id DESC")
        pedidos = cursor.fetchall()
        cursor.close()
        connection.close()
        return pedidos

    @staticmethod
    def fetch_by_id(pedido_id):
        connection = get_db_connection()
        if not connection:
            return None

        cursor = connection.cursor(dictionary=True)
        cursor.execute("SELECT * FROM pedidos WHERE id = %s", (pedido_id,))
        pedido = cursor.fetchone()
        cursor.close()
        connection.close()
        return pedido

    @staticmethod
    def create(cliente, lanche, quantidade, status):
        connection = get_db_connection()
        if not connection:
            return None

        cursor = connection.cursor()
        query = "INSERT INTO pedidos (cliente, lanche, quantidade, status) VALUES (%s, %s, %s, %s)"
        values = (cliente, lanche, quantidade, status)

        try:
            cursor.execute(query, values)
            connection.commit()
            new_id = cursor.lastrowid
            cursor.close()
            connection.close()
            return new_id
        except Error:
            return None

    @staticmethod
    def update(pedido_id, updates, values):
        connection = get_db_connection()
        if not connection:
            return False

        cursor = connection.cursor()
        query = f"UPDATE pedidos SET {', '.join(updates)} WHERE id = %s"
        values.append(pedido_id)

        try:
            cursor.execute(query, values)
            connection.commit()
            cursor.close()
            connection.close()
            return True
        except Error:
            return False

    @staticmethod
    def delete(pedido_id):
        connection = get_db_connection()
        if not connection:
            return False

        cursor = connection.cursor()
        try:
            cursor.execute("DELETE FROM pedidos WHERE id = %s", (pedido_id,))
            connection.commit()
            cursor.close()
            connection.close()
            return True
        except Error:
            return False

    @staticmethod
    def truncate():
        connection = get_db_connection()
        if not connection:
            return False

        cursor = connection.cursor()
        try:
            # Desativa temporariamente a checagem de chaves estrangeiras se houver, limpa e reseta
            cursor.execute("TRUNCATE TABLE pedidos")
            connection.commit()
            cursor.close()
            connection.close()
            return True
        except Error as e:
            print(f"Erro no truncate: {e}")
            return False
