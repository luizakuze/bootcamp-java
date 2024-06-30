# Consultas Avançadas - Consultas com junções e subconsultas

# Junções: JOINs
Combinar dados duas ou mais tabelas relacionadas em uma única consulta

## Tipos de Junções
- INNER JOIN
- LEFT JOIN ou LEFT OUTER JOIN
- RIGHT JOIN ou RIGTH OUTER JOIN
- FULL JOIN ou FULL OUITER JOIN

## INNER JOIN
- Retorna apenas linhas que têm correspondência em ambas as tabelas envolvidas na junção. 
- Caso não haja correspondência, não retorna.
- 'A' intersecção com 'B': Retorna intersecção (comum entre).
```sql
select *
from {tabela1}
inner join {tabela2} on {tabela1.coluna = tabela2.coluna}
```

## LEFT JOIN
- Retorna todas as linhas da tabela à esquerda da junção e as linhas correspondetes da tabela à direita. 
- Se não houver correnpondência, valores da tabela à direita serão null.
- 'A' intersecção com 'B': Retorna 'A' mais intersecção (comum entre).    
```sql
select *
from {tabela1}
left join {tabela2} on {tabela1.coluna = tabela2.coluna}
```


## RIGHT JOIN
- Retorna todas as linhas da tabela à direita da junção e as linhas correspondetes da tabela à esquerda. 
- Se não houver correnpondência, valores da tabela à esquerda serão null.
- 'A' intersecção com 'B': Retorna 'B' mais intersecção (comum entre).    
```sql
select *
from {tabela1}
left join {tabela2} on {tabela1.coluna = tabela2.coluna}
```
## FULL JOIN
- Retorna todas as linhas de todas as tabelas, os valores ausentes (sem relacionamento) vão vir como nulo
- 'A' intersecção com 'B': Retona 'A'm intersecção com B (comum entre) e 'B'.
```sql
select *
from {tabela1}
full join {tabela2} on {tabela1.coluna = tabela2.coluna}
```

# Sub Consultas
Permitem realizar consultas mais complexas permitindo que o resultado de uma consulta seja usada como uma entrada para a próxima.

## Sub Consultas podem ser usadas em partes de uma consulta de
- SELECT
- FROM
- WHERE 
- HAVING
- JOIN
 
# Consultas Avançadas - Funções agregadas e agrupamento de resultados

## Funções Agregadas
Realizam pré processamento ou cálculo para consulta.

- `Count`: Conta o número de registros.
- ``Sum``: Soman os valores de uma coluna numérica.
- ``Avg``: Calcula a média dos valunes de uma coluna numérica.
- ``Min``: Retorna valor mínimo de uma coluna
- ``Max``: Retorna o valor máximo de uma coluna

## Agrupamento de Resultados
- Select... ou From.... + Group By

## Ordenamento de Resultados
- Select... ou From.... + Order By

# Análise de Plano de Execução
- Permite examinar as operações realizadas, tabelas acessadas e os índices utilizados.

- Pode retornar: ``select_type``, ``table``, ``type``, ``possible_keys``, ``key``, ``key_len``, ``ref`` e ``rows``.

```sql
explain
  select *
  from {tabela}
  ...
```

# Índices de Busca
````sql
create index {nome_index}
on {tabela} ({coluna1, coluna2, ..})```