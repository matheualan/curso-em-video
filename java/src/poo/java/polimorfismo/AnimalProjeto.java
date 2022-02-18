package poo.java.polimorfismo;

public class AnimalProjeto {
    public static void main(String[] args) {

        AnimalMamifero animalMam = new AnimalMamifero();
        AnimalReptil animalRep = new AnimalReptil();
        AnimalPeixe animalPei = new AnimalPeixe();
        AnimalAve animalAve = new AnimalAve();
        /*
        animalMam.setPeso(25.5f);
        animalMam.setCorPelo("Preto");
        animalMam.alimentar();
        animalMam.locomover();
        animalMam.emitirSom();
        animalAve.locomover();
        animalPei.locomover();
         */

        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        PeixeBetta peixeBetta = new PeixeBetta();
        Arara arara = new Arara();

        canguru.locomover();
        canguru.emitirSom();
        cachorro.locomover();
    }
}
