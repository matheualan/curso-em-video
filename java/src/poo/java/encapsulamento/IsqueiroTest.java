package poo.java.encapsulamento;

public class IsqueiroTest {

    public static void main(String[] args) {

        Isqueiro bic = new Isqueiro("BIC", "Azul Celeste", 100, true);
        bic.acender();
        bic.acenderBaseado();
    }
}
