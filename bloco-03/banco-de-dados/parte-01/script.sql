-- CREATE TABLE

create table viagens.usuarios (
	id INT, 
    nome VARCHAR(255) not null comment 'Nome de usuário', ##NOT NULL -> preenchimento obrigatório
    email VARCHAR(100) not null unique comment 'E-mail do usuário', ##UNIQUE -> garante único dado com esse nome
    endereco VARCHAR(50) not null comment 'Endereço do usuário',
    data_nascimento DATE not null comment 'Data de nacimento do usuário');
    
create table viagens.destinos (
  id INT,
  nome VARCHAR(255) not null unique comment 'Nome do destino',
  descricao VARCHAR(255)  not null comment  'Descrição do destino'
);

create table viagens.reservas (
  id INT COMMENT 'Identificador único da reserva',
  id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva',
  id_destino INT COMMENT 'Referência ao ID do destino da reserva',
  data DATE COMMENT 'Data da reserva',
  status VARCHAR(255) default 'pendente' comment 'Status da reserva (confirmada, pendente, cancelada, etc.)' ##default -> se não preencher, mantém aquele valor
);


-- INSERT
INSERT INTO viagens.usuarios (id, nome, email, data_nascimento, endereco) VALUES 
(1, 'João Silva', 'joao@example.com', '1990-05-15', 'Rua A, 123, Cidade X, Estado Y'),
(2, 'Maria Santos', 'maria@example.com', '1985-08-22', 'Rua B, 456, Cidade Y, Estado Z'),
(3, 'Pedro Souza', 'pedro@example.com', '1998-02-10', 'Avenida C, 789, Cidade X, Estado Y');

INSERT INTO viagens.destinos (id, nome, descricao) VALUES 
(1, 'Praia das Tartarugas', 'Uma bela praia com areias brancas e mar cristalino'),
(2, 'Cachoeira do Vale Verde', 'Uma cachoeira exuberante cercada por natureza'),
(3, 'Cidade Histórica de Pedra Alta', 'Uma cidade rica em história e arquitetura');

INSERT INTO viagens.reservas (id, id_usuario, id_destino, data, status) VALUES 
(1, 1, 2, '2023-07-10', 'confirmada'),
(2, 2, 1, '2023-08-05', 'pendente'),
(3, 3, 3, '2023-09-20', 'cancelada');


-- SELECT
## Selecionando todas as tabelas da coluna usuários que tenha id=1 e "a" no nome
select * from viagens.usuarios where id=1 or nome like "a"