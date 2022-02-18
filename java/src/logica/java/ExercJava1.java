package basico.java;

import java.util.Arrays;
import java.util.Scanner;

/*
* Total de valores digitas
* Total de numeros pares
* Total de numeros ímpares
* Total de numeros acima de 100
* Media de todos os numeros digitados
*/

public class ExercJava1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0; int tCem = 0; int tSoma = 0;
        int tPar = 0;
        int tImp = 0;
        int tVal = 0;
        int med = 0;
        String parar;
        do {
            System.out.print("Digite um valor de 1 a 10: ");
            num = sc.nextInt();
            tVal += 1;
            tSoma += num;

            if (num > 100) {
                tCem += 1;
            } else if (num % 2 == 0) {
                tPar += 1;
            } else {
                tImp += 1;
            }

            System.out.print("Deseja continuar? [s/n]");
            parar = sc.next();
        } while (parar.equals("s"));
        med = tSoma / tVal;

        System.out.println("\nTotal de valores digitados: " + tVal);
        System.out.println("Total de valores PAR: " + tPar);
        System.out.println("Total de valores IMPAR: " + tImp);
        System.out.println("Total de numeros maiores que 100: " + tCem);
        System.out.println("Soma dos valores: " + tSoma);
        System.out.println("Media dos valores: " + med);

    }
}
