package scr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();

        int[] array = new int[n];


        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Array em ordem crescente:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

        sc.close();
    }


}


