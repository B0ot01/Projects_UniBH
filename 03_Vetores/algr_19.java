// Durante a verificação de estoque, é necessário identificar a presença de determinados produtos. Crie um programa que solicite ao usuário inserir um código de produto e, em seguida, verifique se esse código está presente em um vetor pré-definido.

import java.util.Scanner;

public class algr_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] produtos = { 101, 205, 310, 450, 520 };

        System.out.print("Digite o código de procura: ");
        int codigoProcura = scanner.nextInt();

        Boolean verificacao = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == codigoProcura) {
                System.out.println("\nCódigo " + codigoProcura + " ENCONTRADO");
                verificacao = true;
                break;
            }
        }

        if (verificacao == false) {
            System.out.println("\nCódigo NAO ENCONTRADO");
        }

        scanner.close();
    }
}