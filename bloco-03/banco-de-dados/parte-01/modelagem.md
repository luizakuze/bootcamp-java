# Anotações de Modelagem de Dados

## Tabelas
- Armazenas dados de forma organizada.
- Cada tabela tem um nome único.

## Coluna
- Representa um atributo específico.
- Nome único e tipo de dados associado.

## Registro
- É a linha.
- Instância individual de dados.

## Comando: CREATE TABLE
```sql
CREATE TABLE {nome}
    ({coluna} {tipo} {opções} COMMENT {'comentário'})
```

### Tipos de Dados
- Integer.
- Decimal/Numeric.
- Character/Varchar.
- Date/Time.
- Boolean. 
- Text.

### Opções
- Restrição de Valor: ``NOT NULL``, ``UNIQUE`` e ``DEFAULT``.
- Chaves primárias e estrangeiras.
- Auto Incremento.

## Comando: INSERT
```sql
INSERT INTO
 {nome-tabela}
 {[coluna1, coluna2]} ## possível ocultar essas linhas...
VALUES
 {[valor-coluna1, valor-coluna2]}
```

## Comando: SELECT
### Sem where
```sql
select {lista-colunas}
from tabela;
```

### Com where
```sql
select {lista-colunas}
from tabela
where {condicao};
```
'*' : Retorna todas as colunas.

## Operadores 
- `LIKE`: Comparação de padrões.
- `IN`: Pertence a uma lista de valores.
- ``BETWEEN`: Dentro de um intervalo
- `AND`: E lógico.
- `OR`: Ou lógico.
- `<>` ou `!=`: Diferente.

## Comando: UPDATE
- Modificar a estrutura já existente de um registro.
```sql
update {tabela}
set
 {coluna1} = {novo_valor1}
 {coluna2} = {novo_valor2}
where
 {condicao};
```

## Comando: DELETE
- Exclui permanentemente um registro.

```sql
delete from 
 {tabela}
where
 {condicao};
```

## Comando: DROP TABLE
- Exclui permanentemente uma tabela.
```sql
drop table {tabela}
```

## Comando: ALTER TABLE
- Modificar a estrutura já existente de uma tabela.
```sql
drop table {tabela}
```

## Chave Primária
- Identifica exclusivamente, ÚNICA por tabela.
- Não pode conter null values.

### Adicionando a primary key na criação da tabela
```sql
create table {tabela}
(id primary key autoincrement, 
...);
```
### Adicionando a primary key quando a tabela já está criada
```sql
alter table {tabela}
modify column id int primary key
```

## Chave Estrangeira
- Manter integridade dos dados entre tabelas relacionadas
- Pode ser null (registro órfão).
- Pode haver mais de uma (ou nenhuma) por tabela.

### Cláusulas
- `ON DELETE`:Especifica o que acontece com registros filhos quando um registro pai é excluído.
- `ON UPDATE`: Especifica comportamento do registro filho quando registro pai for alterado.
- `CASCADE`, ``SET NULL`, `SET DEFAULT` e `RESTRICT`.

### Adicionando a foreign key na criação da tabela
```sql
create table `tabela` (
 id int primary key, 
 chave_estrangeira int,
foreign key {chave_estrangeira} references {outra_tabela} (id)
);
```
### Adicionando a foreign key na tabela existente
```sql
alter table {tabela}
add constraint {nome_constraint}
foreign key (id)
references {outra_tabela} (id)
```
## Registro pai e filho
### Registro Pai
O registro pai reside na tabela que contém a chave primária (primary key).  

### Registro Filho
O registro filho reside na tabela que contém a chave estrangeira (foreign key), que é usada para referenciar a chave primária na tabela pai. 

### Regras Gerais para Identificar Pai e Filho
- ``Um-para-Muitos``: A entidade que pode ter múltiplas ocorrências associadas (muitos) será a filha. A entidade singular (um) será a pai. Exemplo: Clientes e Pedidos (Cliente é pai, Pedidos são filhos)
- ``Muitos-para-Muitos``: Use uma tabela de junção que referencia ambas as tabelas. Exemplo: Estudantes e Cursos (tabela de junção Estudantes_Cursos)
- ``Um-para-Um``: Decida a tabela pai com base na lógica de negócio ou frequência de uso. Geralmente, a entidade que agrega ou gerencia a outra é considerada a pai. Exemplo: Pessoa e Passaporte (Pessoa é pai, Passaporte é filho)
