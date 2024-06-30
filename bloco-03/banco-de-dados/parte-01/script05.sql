-- Evitando multiplicidade de dados na coluna endereço

-- Adicionar colunas de endereço à tabela "Usuarios"
ALTER TABLE Usuarios
ADD rua VARCHAR(100),
ADD numero VARCHAR(10),
ADD cidade VARCHAR(50),
ADD estado VARCHAR(50);

-- Copia os dados da tabela original para a nova tabela
-- SUBSTRING_INDEX(string, delimiter, count)

-- Endereço atual tem esse formato: Rua B, 456, Cidade Y, Estado Z
UPDATE usuarios
SET rua = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 1), ',', -1),  -- Rua B
    numero = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 2), ',', -1), -- 1) seleciona "Rua B, 456" e 2) seleciona de trás pra frente -1 "456"
    cidade = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 3), ',', -1),
    estado = SUBSTRING_INDEX(endereco, ',', -1);

-- Exclusão da coluna "endereco" da tabela original
ALTER TABLE usuarios
DROP COLUMN endereco;