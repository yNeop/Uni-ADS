create database monitoria;
use monitoria;

create table alunos (
	id int not null primary key auto_increment,
    nome varchar(100),
    idade int,
    cpf varchar(100),
    dtnasc date
);

insert into alunos (nome, idade, cpf, dtnasc) values
('Ana Souza', 20, '123.456.789-00', '2005-02-15'),
('Cauã Sousa', 20, '057.555.041-48', '2004-04-28');

select * from alunos;