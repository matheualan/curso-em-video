package poo.java.polimorfismo;

public class Canguru extends AnimalMamifero {

    @Override
    public void locomover() {
        System.out.println("Canguru saltando! Up Up Up!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Canguru!");
    }

    public void usarBolsa() {
        System.out.println("Usando bolsa!");
    }
}
