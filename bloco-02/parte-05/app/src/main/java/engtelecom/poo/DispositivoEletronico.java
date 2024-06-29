package engtelecom.poo;

// Não pode ser instanciado!
public abstract class DispositivoEletronico {
    private double frequencia;
    private double tamanho;

    public DispositivoEletronico(double frequencia, double tamanho) {
        this.frequencia = frequencia;
        this.tamanho = tamanho;
    }

    public double verificaTamanho(){
        return 111;
    }

    public double verificaTamanho(int n) {
        return 2;
    }

    // Obrigatoriamente, as classes filhas vão ter que herdar esse mpetodo abstrato
    public abstract void ligar();
}
