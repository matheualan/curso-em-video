package basico.java;

import java.util.Arrays;

public class OrdemArraysSort {

    public static void main(String[] args) {

        int num[] = {8, 5, 6 , 3, 9, 10, 1, 2, 4, 7};
        Arrays.sort(num);
        System.out.print(Arrays.toString(num));
        System.out.print("\nO numero que vc digitou esta no slot: "
                + Arrays.binarySearch(num, 5));
    }
}
