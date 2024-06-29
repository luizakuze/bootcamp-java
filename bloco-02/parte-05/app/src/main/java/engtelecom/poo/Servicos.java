package engtelecom.poo;

public interface Servicos {
    
    // default: não exije obrigatoriamente uma implementação, mas pode sobrescrever
    public default void atualizarVersao() {
        System.out.println("Atualizei!"); 
    }

    // public abstract void mudarPlanoDeFundo();
    void mudarPlanoDeFundo();
}
