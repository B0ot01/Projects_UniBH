// Escreva um programa em java que crie um vetor com 10 números inteiros aleatórios e depois calcule a média dos elementos deste vetor.

import java.util.Scanner;

public class algr_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do vetor " + i + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            contador++;
        }

        float media = (float) soma / contador;
        System.out.println("\nA média dos valores é: " + media);

        scanner.close();
    }
}