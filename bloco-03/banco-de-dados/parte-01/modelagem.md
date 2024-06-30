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
```sql
update {tabela}
set
 {coluna1} = {novo_valor1}
 {coluna2} = {novo_valor2}
where
 {condicao};
```

## Comando: UPDATE

```sql
delete from 
 {tabela}
where
 {condicao};
```