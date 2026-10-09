// Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números primos e suas respectivas posições.

import java.util.Scanner;

public class algr_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[10];
        int primo = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite o numero do vetor " + i + ": ");
            numero[i] = scanner.nextInt();
        }

        System.out.println("\nPosisoes 0 - 9 ");

        for (int j = 0; j < numero.length; j++) {

            for (int l = 1; l <= numero[j]; l++) {
                if (numero[j] % l == 0) {
                    primo++;
                }
            }

            if (primo == 2) {
                System.out.println("Número " + numero[j] + ", " + j + "° posiçao. É primo");
            }
            primo = 0;
        }
        scanner.close();
    }
}