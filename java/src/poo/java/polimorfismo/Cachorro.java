package poo.java.polimorfismo;

public class Cachorro extends AnimalMamifero {

    @Override
    public void locomover() {
        System.out.println("Cachorro andando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo! Au Au Au!");
    }
}
