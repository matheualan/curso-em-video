package poo.java.polimorfismo;
/*
* ***** Polimorfismo de sobrecarga *****
*/
public class Lobo extends Cachorro {

    @Override
    public void locomover() {
        System.out.println("Correndo muito rapido");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ruivando AUUUUU!!!!");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Lobinho lindo")){
            System.out.println("Se aproximar amigavelmente e dar a cabeca para alisar.");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min) {
        if (hora >= 4 && hora < 12) {
            System.out.println("Dormindo");
        } else if (hora >= 12 && hora < 20) {
            System.out.println("Caçando!!!");
        } else if (hora >= 20 && hora < 25) {
            System.out.println("Ruivar AAUUUU!!!");
        } else {
            System.out.println("Hora invalida");
        }
    }
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    }
    public void reagir (int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}

