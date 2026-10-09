// Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.

import java.util.Scanner;

public class algr_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosVetor1 = new int[10];
        int[] numerosVetor2 = new int[10];
        int[] somaVetor3 = new int[20];
        int contador = 0;

        System.out.println("--VETOR 1--\n");
        for (int i = 0; i < numerosVetor1.length; i++) {
            System.out.print("Digite o número do vetor " + i + ": ");
            numerosVetor1[i] = scanner.nextInt();
        }

        System.out.println("\n--VETOR 2--\n");
        for (int j = 0; j < numerosVetor2.length; j++) {
            System.out.print("Digite o número do vetor " + j + ": ");
            numerosVetor2[j] = scanner.nextInt();
        }

        for (int k = 0; k < 10; k++) {
            somaVetor3[contador] = numerosVetor1[k];
            contador++;
            somaVetor3[contador] = numerosVetor2[k];
            contador++;
        }

        System.out.println("\n--VETOR 3--\n");
        for (int l = 0; l < somaVetor3.length; l++) {
            System.out.println(somaVetor3[l]);
        }

        scanner.close();
    }
}