// Escreva um programa em java que preencha um vetor com 15 números inteiros aleatórios entre 1 e 50. Verifique se o número 20 existe nesse vetor e retorne seu índice caso ele exista. 

import java.util.Scanner;

public class algr_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[15];
        int posicao = 0;
        Boolean validacao = false;

        System.out.println("Digite um número inteiro entre 1 - 50\n");
        for (int i = 0; i < numero.length; i++) {

            System.out.print("Digite o número do vetor " + i + ": ");
            numero[i] = scanner.nextInt();

            if (numero[i] > 0 && numero[i] <= 50) {
                if (numero[i] == 20) {
                    posicao = i;
                    validacao = true;
                }
            } else {
                System.out.println("\nERRO! \nSeu número deve estar entre 1 - 50\n");
                i--;
            }
        }

        if (validacao == true) {
            System.out.println("\nSeu Vetor contém o número 20 no vetor de posiçao " + posicao + "!!!");
        } else {
            System.out.println("\nSeu Vetor nao possui o número 20");
        }

        scanner.close();
    }
}