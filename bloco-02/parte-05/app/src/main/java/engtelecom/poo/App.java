package engtelecom.poo;
  
public class App {
    public static void main(String[] args) {
        //DispositivoEletronico d = new DispositivoEletronico(12, 12); ERRO! CLASSE ABSTRATA!
        Tele t = new Tele(444, 444);
        Celular c = new Celular(444, 444);

        System.out.println(t.verificaTamanho()); // pega o da superclasse
        System.out.println(c.verificaTamanho()); // pega o da classe celular que já tem
    }
}
