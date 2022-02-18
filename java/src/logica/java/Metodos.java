package basico.java;

public class Metodos {

    static void MedAritm(int n1, int n2, int n3, int n4) {

        int soma = n1 + n2 + n3 + n4;
        int media = soma / 4;
        System.out.println("Soma das notas: " + soma);
        System.out.println("Media das notas: " + media);
    }
    public static void main (String[] args) {

        MedAritm(10, 9, 8, 7);
    }
}
