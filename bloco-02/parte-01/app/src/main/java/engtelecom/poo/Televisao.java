package main.java.engtelecom.poo;

public class Televisao {
    private boolean ligada;
    private int canal;
    private int volume;

    public Televisao() {
        Televisao(false, 1, 25);
    }

    public Televisao(int canal){
        Televisao(false, canal, 23);
    }

    public Televisao(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }
    /*** 
     * Função para aumentar o volume da televisão
     */
    public void aumentarVolume() {
        this.volume++;
    }
    /***
     * Função para ligar ou desligar a televisão
     */
    public void LigarOuDesligar() {
        this.ligada = !this.ligada;
    }
}
