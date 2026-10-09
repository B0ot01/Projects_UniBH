// Crie um programa que irá gerar um vetor A com 15 números inteiros e depois crie um vetor B que será a cópia do vetor A de forma reversa.

import java.util.Random;

public class algr_08 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(1, 999);
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor A\n");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor" + i + ": " + vetorA[i]);
        }

        System.out.println("\nVetor B em ordem inversa\n");
        for (int i = vetorB.length - 1; i >= 0; i--) {
            System.out.println("Vetor" + i + ": " + vetorB[i]);
        }
    }
}