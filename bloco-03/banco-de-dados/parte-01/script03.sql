-- PRIMEIRA FORMA PARA ALTERAR ESTRUTURA DA TABELA (MELHOR...)
-- Simplesmente realizar a alteração sem remover a tabela;
create table viagens.usuarios_nova (
	id INT, 
    nome VARCHAR(255) not null comment 'Nome de usuário', ##NOT NULL -> preenchimento obrigatório
    email VARCHAR(100) not null unique comment 'E-mail do usuário', ##UNIQUE -> garante único dado com esse nome
    endereco VARCHAR(50) not null comment 'Endereço do usuário',
    data_nascimento DATE not null comment 'Data de nacimento do usuário');
    
alter table viagens.usuarios modify column endereco varchar(100);