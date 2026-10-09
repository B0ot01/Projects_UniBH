// Escreva um programa em java que preencha um vetor com 30 números inteiros aleatórios entre 1 e 100. Peça ao usuário para digitar um valor, verifique se este valor existe no vetor e remova ele do vetor.

import java.util.Scanner;
import java.util.Random;

public class algr_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numero = new int[30];
        int numeroExcluirVetor;
        Boolean casoContrario = true;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(1, 101);
        }

        System.out.print("\nDigite um número aleatório: ");
        numeroExcluirVetor = scanner.nextInt();

        for (int j = 0; j < numero.length; j++) {
            if (numero[j] == numeroExcluirVetor) {
                numero[j] = 0;
                casoContrario = false;
            }
        }

        if (casoContrario == true) {
            System.out.println("O número indicado nao consta no Vetor, portanto nao foi removido");
        } else {
            System.out.println("O numero " + numeroExcluirVetor + " consta no vetor. Entao foi removido");
        }

        scanner.close();
    }
}