# Spring Framework

- Composto por módulos para reduzir a complexidade da aplicação. Há módulos para: Web, Data Access, Core Container, testes, etc.

## Spring x Java EE
- Spring simplifica o desenvolvimento, eliminando a necessidade de seguir os processos obrigatórios e complexos do Java EE.

## Inversão de Controle (IoC)
- Redireciona o fluxo de execução do código, delegando o controle para um container.
- Sem IoC: É necessário criar o objeto antes de usá-lo.
- Com IoC: O container carrega os objetos necessários, que já estão prontos para uso quando a aplicação inicia.

## Injeção de Dependências (DI)
- Mantém o baixo acoplamento entre módulos de um sistema.
- O container gerencia os objetos reais, permitindo que as implementações sejam semelhantes a interfaces.

## Beans
- Objetos instanciados, montados e gerenciados por um container.

## Scopes
- Singleton: Um único objeto compartilhado por toda a aplicação. Apenas uma instância de objeto.
- Prototype: Uma nova instância é criada a cada solicitação ao container.
- HTTP: Bean para cada requisição HTTP. Objetos existem apenas durante a execução da requisição. Tipos: Session (sessão do usuário), Global (ciclo de vida da aplicação) e Autowired (indicação de onde ocorrerá injeção automática de dependência).
