# Método Estático

- Pode ser chamado sem criar uma instância da classe;
- É chamado diretamente pelo nome da classe.

```java
public class Exemplo {
    // Método estático
    public static void metodoEstatico() {
        System.out.println("Método estático chamado");
    }

    // Método de instância
    public void metodoDeInstancia() {
        System.out.println("Método de instância chamado");
    }

    public static void main(String[] args) {
        // Chamando o método estático
        Exemplo.metodoEstatico();

        // Criando uma instância da classe
        Exemplo obj = new Exemplo();

        // Chamando o método de instância
        obj.metodoDeInstancia();
    }
}
```