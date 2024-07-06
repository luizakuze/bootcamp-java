package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Semelhante ao App, mas para o spring

@Component
public class MyApp implements CommandLineRunner {
    // transformando objetos em beans (component)
    // e injeção de dependências (autowired)
    @Autowired
    private Calculadora calculadora;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculadora.somar(1,2));
    }
    
}
