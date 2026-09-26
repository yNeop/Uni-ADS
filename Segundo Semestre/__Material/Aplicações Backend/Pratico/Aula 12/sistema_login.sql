CREATE DATABASE sistema_login;

USE sistema_login;

CREATE TABLE usuarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);

select * from usuarios;

ALTER TABLE usuarios
ADD COLUMN token_recuperacao VARCHAR(255);

ALTER TABLE usuarios
ADD COLUMN token_expiracao DATETIME;

truncate usuarios;