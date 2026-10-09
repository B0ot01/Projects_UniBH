// Em um sistema de classificação de produtos, é necessário ordenar os produtos por preço. Escreva um programa que leia os preços de 10 produtos e, em seguida, ordene esses preços em ordem crescente e imprima o vetor ordenado.

import java.util.Scanner;
import java.util.Arrays;

public class algr_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] numeros = new float[10];
        int contadorPrecos = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do preço " + contadorPrecos + ": ");
            numeros[i] = scanner.nextFloat();
            contadorPrecos++;
        }

        Arrays.sort(numeros);

        contadorPrecos = 1;
        System.out.println("\nOrdem dos preços organizados");
        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Preço " + contadorPrecos + " = " + numeros[j]);
            contadorPrecos++;
        }

        scanner.close();
    }
}