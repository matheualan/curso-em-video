package poo.java.encapsulamento;

public class LutadorTest {
    public static void main(String[] args) {

        Lutador[] lut = new Lutador[4];
        lut[0] = new Lutador("Matheus", "Brasileiro", 26, 7, 1, 2, 1.70f, 70.5f);
        //lut[0].apresentar();

        lut[1] = new Lutador("Allien", "Americano", 28, 5, 3, 2, 1.75f, 90.5f);
        //lut[1].apresentar();

        lut[2] = new Lutador("Perrero", "Espanhol", 25, 8, 2, 0, 1.65f, 77.7f);
        //lut[2].apresentar();

        lut[3] = new Lutador("Vieirra", "Chileno", 30, 6, 1, 3, 1.90f, 95.7f);
        //lut[3].apresentar();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lut[0], lut[2]);
        UEC01.lutar();

        lut[0].apresentar();

    }
}
