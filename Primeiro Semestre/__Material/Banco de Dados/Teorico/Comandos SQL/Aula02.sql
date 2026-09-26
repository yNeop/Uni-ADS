-- CRIAR UM BANCO DE DADOS CHAMADO OAB
create database caua_oab;
use caua_oab;
-- CRIAR TABELA ADVOGADO
create table advogado (
	num_oab int not null primary key,
    nome varchar(100)
);
-- CRIAR TABELA PROCESSO
create table processo (
	num_processo int not null primary key,
    descricao text
);
-- CRIAR TABELA ATUAÇÃO COM 2 CHAVES ESTRANGEIRAS
create table atuacao (
	num_oab int not null,
    num_processo int not null,
    primary key (num_oab, num_processo),
    foreign key (num_oab) references advogado (num_oab),
    foreign key (num_processo) references processo (num_processo)
);
-- VAMOS INSERIR DADOS NA TABELA
insert into advogado (num_oab, nome) values
(123, 'João da Silva'),
(456, 'Maria de Sousa'),
(789, 'Lucas Pereira');

select * from advogado;

insert into advogado (num_oab, nome) values
(321, 'Joaquim Neves');
-- PARA EXCLUIR UM REGISTRO É USADO O COMANDO DELETE
/*	POSSO VERIFICAR AS MUDANÇAS USANDO O SELECT ANTERIOR 
	SEM A NECESSIDADE DE DIGITAR O CODIGO NOVAMENTE
	APENAS APERTANDO CTRL + ENTER NA LINHA CERTA	*/
delete from advogado where num_oab = 456;
-- PARA ALTERAR UM DADO CADASTRADO NA TABELA
update advogado 
	set nome = 'Joaquim Nunes'
    where num_oab = 321;

-- EXERCICIOS..................

-- EXERCICIO 01 
/*	Insira 3 advogados com os seguintes dados:
(101, 'Ana Souza')
(102, 'Carlos Mendes')
(103, 'Juliana Alves')	*/
use caua_oab;
insert into advogado (num_oab, nome) values
(101, 'Ana Souza'),
(102, 'Carlos Mendes'),
(103, 'Juliana Alves');
-- EXERCICIO 02
/*	Insira 3 processos com as descrições abaixo:
2001: "Ação trabalhista contra empresa XPTO"
2002: "Processo de divórcio"
2003: "Revisão de contrato bancário"	*/
insert into processo (num_processo, descricao) values
(2001, 'Ação trabalhista contra empresa XPTO'),
(2002, 'Processo de divórcio'),
(2003, 'Revisão de contrato bancário');
-- EXERCICIO 03
/*	Atualize o nome do advogado com OAB 102 para 
"Carlos M. Mendes da Silva"	*/
update advogado 
	set nome = 'Carlos M. Mendes da Silva'
    where num_oab = 102;
-- EXERCICIO 04
/*	Atualize a descrição do processo 2002 para 
"Processo de divórcio consensual entre as partes"	*/
update processo 
	set descricao = 'Processo de divórcio consensual entre as partes'
    where num_processo = 2002;
-- EXERCICIO 05
/*	Altere a tabela ADVOGADO para incluir um campo 
de email (tipo VARCHAR de 100 caracteres)	*/
alter table advogado add column email varchar(100) not null;

select * from advogado;
select * from processo;