package main.java.engtelecom.poo;

public class Carta {
    private Naipe naipe;
    //private Valor valor;
    
    public Carta(Naipe naipe ) {
        this.naipe = naipe;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public String toString(){
        return "" + this.naipe.simbolo;
    }
    
}