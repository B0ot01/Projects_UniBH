// Crie um programa em java para instanciar um vetor de 5 posições de números decimais e encontre o maior valor e o menor valor deste um

import java.util.Scanner;

public class algr_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numero = new float[5];
        float maiorNumero = 0;
        float menorNumero = 0;

        System.out.print("Digite o valor do vetor 0: ");
        numero[0] = scanner.nextFloat();
        maiorNumero = numero[0];
        menorNumero = numero[0];

        for (int i = 1; i < numero.length; i++) {
            System.out.print("Digite o valor do vetor " + i + ": ");
            numero[i] = scanner.nextFloat();

            if (numero[i] > maiorNumero) {
                maiorNumero = numero[i];
            }

            if (numero[i] < menorNumero) {
                menorNumero = numero[i];
            }
        }

        System.out.println("\nO maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

        scanner.close();
    }
}