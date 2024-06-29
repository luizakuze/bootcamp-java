package  engtelecom.poo;

public class Tele extends DispositivoEletronico {

    public Tele(double frequencia, double tamanho) {
        super(frequencia, tamanho);
    }

    @Override
    public double verificaTamanho() {
        return 123;  // ou qualquer lógica que você desejar
    }

    @Override
    public void ligar() {
        System.out.println("Televisão ligando!");
    }
}
