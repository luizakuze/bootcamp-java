# Conceitos

## Herança
- Herança pode ser lida como **é um**.
- Superclasse pode ser instanciada no App;
- Somente métodos concretos.

```java 
public class SuperClasse {
    public void metodo1() {};
    public void metodo2();
}
```

## Classe Abstrata
- Utiliza características da herança.
- Não podem haver instâncias no App.
- Métodos abstratos DEVEM ser implementados pelas subclasses.
- Pode conter métodos abstratos e concretos.

```java 
public abstract class SuperClasse {
    public abstract void metodo1();
    public void metodo2();
}
```

## Polimorfismo
- A fim de ao adicionar uma nova funcionalidade ao código, não alterar a classe App.

```java
// O vetor da superclasse pode armazenar objetos das suas subclasses
Personagem vetP[] = new Personagem[4];

vetP[0] = new Aldeao();
vetP[1] = new Arqueiro();
vetP[2] = new Cavaleiro();
vetP[3] = new Guerreiro();

// o método mover existe na superclasse, implementado por cada uma das subclasses.
// NÃO É ALTERADO AO ADICIONAR NOVOS PERSONAGENS!
for(int i = 0; i < 4; i++){
    vetP[i].mover();
}
```

## Interface
- Como não é possível herdar de duas classes... Resolvemos o problema com a interface.
- É semelhante a classe abstrata, porém somente contém somente constantes e métodos abstratos.
- Não pode ser instanciada.

```java

```