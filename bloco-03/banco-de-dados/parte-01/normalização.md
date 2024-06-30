# Anotações de Normalização de Dados

- Eliminar anomalias e redundâncias.
- Consistência de dados.

## Formas Normais
- `1FN: Atomicidade`: Cada valor em uma tabela deve ser atômico, ou seja, indivisível. Nenhum campo deve conter múltiplos valores. <br> Exemplo: um campo "endereço" composto por múltiplos valores, como rua, número, cidade e estado.

- `2FN: Atributos`: Todos os atributos não devem depender totalmente da chave primária. 

- `3FN: DependÇencias transitivas`: Nenhuma coluna não-chave depender de uma coluna não-chave.

Ao todo são 3 FN's.

