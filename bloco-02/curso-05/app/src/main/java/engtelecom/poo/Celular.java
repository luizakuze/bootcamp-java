package  engtelecom.poo;

public class Celular extends DispositivoEletronico {

    public Celular(double frequencia, double tamanho) {
        super(frequencia, tamanho);
    }

    @Override
    public double verificaTamanho() { 
        return 111111;
    }

    @Override
    public void ligar() {
        System.out.println("Celular ligando!");
    }
}
