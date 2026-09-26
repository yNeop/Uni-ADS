CREATE DATABASE aula_python;
USE aula_python;

CREATE TABLE clientes (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100)
);

SELECT * FROM clientes;

CREATE TABLE produtos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco DECIMAL(10,2),
    estoque INT
);	

SELECT * FROM produtos;

TRUNCATE TABLE produtos;
TRUNCATE TABLE clientes;