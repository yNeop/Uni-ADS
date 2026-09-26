-- COMENTARIO
/*
	COMENTARIO MAIS DE UMA LINHA
	PRIMEIRA AULA, COMANDOS DDL
*/
-- CRIAR UM BANCO DE DADOS CHAMADO UNIPROJECAO
create database uniprojecao;
-- COLOCAR BANCO DE DADOS EM USO
use uniprojecao;
-- CRIAR TABELA ALUNO
create table aluno
(
	matricula int not null primary key,
    nome varchar(80) not null,
    email varchar(80) not null,
    dt_nascimento date not null
);
-- DESC EXIBE UMA DESCRIÇÃO DA TABELA
desc aluno;
-- ALTERA A ESTRUTURA FISICA DA TABELA
alter table aluno add column cpf varchar(11) not null;
/*
	ALTER TABLE PODE ADICIONAR, APAGAR, RENOMEAR OU 
	MODIFICARA UMA COLUNA E ETC
*/
alter table aluno drop column email;
desc aluno;
-- COMANDO QUE APAGA TODA A TABELA E DADOS INCLUSOS
drop table aluno;
-- COMANDO QUE APAGA TODO O BANCO DE DADOS
drop database uniprojecao;

-- RECRIANDO
create database CauaS_Aula;
use CauaS_Aula;
create table aluno
(
	matricula int not null primary key,
    nome varchar(80) not null,
    cpf varchar(11) not null,
    email varchar(80) not null,
    dt_nascimento date not null
);
desc aluno;

-- ATIVIDADES PRATICAS 2
create table curso
(
	id_curso int not null primary key,
    nome VARCHAR(100) not null,
    carga_horaria int not null,
    nivel enum('Técnico', 'Graduação', 'Pós Graduação') not null
);
desc curso;

-- ATIVIDADES PRATOCAS 3
create table advogado
(
	num_aob int not null primary key,
    nome varchar(80) not null
);
create table processo
(
	num_processo int not null primary key,
    descricao text
);