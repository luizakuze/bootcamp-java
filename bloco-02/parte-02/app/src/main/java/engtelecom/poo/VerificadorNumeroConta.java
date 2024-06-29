

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número da conta bancária: ");
            String numeroConta = scanner.nextLine();
        
            // verifica se o número de conta tem exatamente 8 dígitos
            if (numeroConta.length() != 8) { 
                // vai disparar a exceção...
               throw new Exception();
            } else {
                System.out.println("Deu certo!");
            }
            
        } catch (Exception e) { 
            System.out.println("Erro: " + e.getMessage() );
        } finally { 
            scanner.close();
        }
    } 
}