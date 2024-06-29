package engtelecom.poo;

public class App2 {
    public static void main(String[] args) {
        Tele t = new Tele(444, 444);
        Celular c = new Celular(444, 444);

        System.out.println(t.verificaTamanho());
        System.out.println(c.verificaTamanho());
    }
}
