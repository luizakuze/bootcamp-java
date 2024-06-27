# Estruturas de Exceção em Java
-  As exceções são representadas por objetos que encapsulam informações sobre o erro ocorrido.  
- 2 formas principais de tratamento: Tratando a exceção no próprio método em que ela será disparada ou deixar que toda vez que ele seja utilizado, tratar ele nesse local em que é chamado.
- A classe ``MaskFormatter`` é usada para formatar e editar Strings, a máscara indica quais o caracteres válidos que podem estar na String.

## Opção 1) Tratando a exceção

```java
public class Exemplo {

    // Exemplo de método que trata a exceção localmente
    public double divide(int dividendo, int divisor) {
        double resultado = 0;

        try {
            resultado = dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
            e.printStackTrace();
        }

        return resultado;
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        System.out.println(exemplo.divide(10, 0));
    }
}
```

## Opção 2) Encaminhando a exceção
```java
public class Exemplo {

    // Exemplo de método que encaminha a exceção usando throws
    public double divide(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();

        try {
            System.out.println(exemplo.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
            e.printStackTrace();
        }
    }
}
```

- É possível criar uma exceção costumizada em Java

```java
// Definição da exceção personalizada
public class MinhaExcecao extends Exception {

    // Construtor sem parâmetros
    public MinhaExcecao() {
        super();
    }

    // Construtor que recebe uma mensagem de erro
    public MinhaExcecao(String mensagem) {
        super("mensagem");
    }

    // Construtor que recebe uma mensagem de erro e uma causa
    public MinhaExcecao(String mensagem, Throwable causa) {
        super("mensagem", "causa");
    }

    // Exemplo de método que lança a exceção personalizada
    public void exemploMetodo() throws MinhaExcecao {
        // Condição que justifica o lançamento da exceção
        if ("algumaCondicao") {
            throw new MinhaExcecao("Ocorreu uma situação que justifica a minha exceção.");
        }
    }
}

// Exemplo de uso da exceção personalizada
public class Exemplo {
    
    public void metodoExemplo() throws MinhaExcecao {
        // Chamando o método que lança a exceção personalizada
        new MinhaExcecao().exemploMetodo();
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();

        try {
            exemplo.metodoExemplo();
        } catch (MinhaExcecao e) {
            // Tratamento da exceção personalizada
            System.out.println("Exceção capturada: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```