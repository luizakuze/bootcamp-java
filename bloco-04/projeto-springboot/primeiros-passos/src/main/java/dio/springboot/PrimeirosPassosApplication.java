package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		
		// objeto não está no contexto springboot... injeção de dependências não acontece...
		// Calculadora calculadora = new Calculadora();

		// comando disponível através de uma interface para o spring ter disponibilizado os objetos
	}

}
