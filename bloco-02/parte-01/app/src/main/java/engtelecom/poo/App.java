/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import main.java.engtelecom.poo.Televisao;

public class App {

    public static void main(String[] args) {

        // loop simplificado
        String alunos [] = {"Luiza", "Luana", "Laís"};
        for (String estudante : alunos) {
            System.out.println(estudante);
        }
        

        Televisao tv = new Televisao();
        tv.LigarOuDesligar();
        tv.aumentarVolume(); 




        final String BR = "Brasil"; // constante em Java
        // BR = "EUA" não funciona
        System.out.println("Olá, " + nomeCompleto("Luiza", "Kuze"));
        System.out.println(verificaAprovacao(2));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + ' ' + segundoNome;
    } 

    // Se for maior que 7 é aprovado e reprovado caso contrário
    public static boolean verificaAprovacao(int nota) {
        return (nota>7);
    } 
}
