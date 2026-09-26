create database if not exists aula_python;

use aula_python;

CREATE TABLE clientes (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50),
    email VARCHAR(100),
    PRIMARY KEY (id)
);

TRUNCATE clientes;