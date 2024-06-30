-- PRIMEIRA FORMA PARA ALTERAR ESTRUTURA DA TABELA (MAIS COMPLEXA...)
-- Apagar a tabela antiga e criar outra com a nova alteração.

create table viagens.usuarios_nova (
	id INT, 
    nome VARCHAR(255) not null comment 'Nome de usuário', ##NOT NULL -> preenchimento obrigatório
    email VARCHAR(100) not null unique comment 'E-mail do usuário', ##UNIQUE -> garante único dado com esse nome
    endereco VARCHAR(150) not null comment 'Endereço do usuário',
    data_nascimento DATE not null comment 'Data de nacimento do usuário');
    
-- migrando tabela anterior para nova
insert into viagens.usuarios_nova (id, nome, email, endereco, data_nascimento) 
select id, nome, email, endereco, data_nascimento 
from viagens.usuarios

-- removendo tabela antiga
drop table viagens.usuarios;

-- renomeando tabela antiga
alter table viagens.usuarios_nova rename usuarios;