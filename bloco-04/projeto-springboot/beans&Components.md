# Beans & Components

## Components
- Uso: Tem acesso ao código fonte.
```java
@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyServiceImpl(); // Criação detalhada do objeto
    }
}
```

## Beans
- Uso: Utiliza bibliotecas e frameworks externos.
```java
@Component
public class MyComponent {
    //...
}

@Service
public class MyService {
    //...
}

@Repository
public class MyRepository {
    //...
}

@Controller
public class MyController {
    //...
}