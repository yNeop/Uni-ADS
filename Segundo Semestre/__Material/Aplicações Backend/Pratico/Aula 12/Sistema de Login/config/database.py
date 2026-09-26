import mysql.connector
import pymysql

def conectar():
    return mysql.connector.connect(
        host="localhost",
        user="root",
        password="",
        database="sistema_login",
        port=3306,
        use_pure=True
    )