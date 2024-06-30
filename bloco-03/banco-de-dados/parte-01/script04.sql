-- Adicionando chaves primárias
alter table usuarios
modify column id int auto_increment,
add primary key (id);

alter table destinos
modify column id int AUTO_INCREMENT,
add primary key (id);

-- Adicionando chaves primárias e estrangeiras
-- Chave estrangeira para referência dos usuários e destinos