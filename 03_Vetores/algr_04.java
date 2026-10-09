// Escreva um programa em java que preencha um vetor com 20 números inteiros aleatórios entre 1 e 30 e depois verifique se o número 25 existe neste vetor.

import java.util.Scanner;

public class algr_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[20];
        int posicao = 0;
        Boolean validacao = false;

        System.out.println("Digite um número inteiro entre 1 - 30\n");
        for (int i = 0; i < numero.length; i++) {

            System.out.print("Digite o número do vetor " + i + ": ");
            numero[i] = scanner.nextInt();

            if (numero[i] > 0 && numero[i] <= 30) {
                if (numero[i] == 25) {
                    posicao = i;
                    validacao = true;
                }
            } else {
                System.out.println("\nERRO! \nSeu número deve estar entre 1 - 30\n");
                i--;
            }
        }

        if (validacao == true) {
            System.out.println("\nSeu Vetor contém o número 25 no vetor de posiçao " + posicao + "!!!");
        } else {
            System.out.println("\nSeu Vetor nao possui o número 25");
        }

        scanner.close();
    }
}