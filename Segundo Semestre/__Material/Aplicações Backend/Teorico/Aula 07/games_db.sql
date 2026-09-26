CREATE DATABASE games_db;

USE games_db;

CREATE TABLE games (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    genero VARCHAR(50),
    preco DECIMAL(10,2)
);

SELECT * FROM games;

TRUNCATE TABLE games;