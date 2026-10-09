// Em uma pesquisa de opinião, é necessário registrar as respostas dos entrevistados. Crie um programa que leia 5 respostas (números inteiros) de entrevistados e, em seguida, imprima essas respostas na ordem inversa em que foram registradas.

import java.util.Scanner;

public class algr_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[5];

        int contador = 1;

        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Digite a resposta da opiniao " + contador + ": ");
            respostas[i] = scanner.nextLine();
            contador++;
        }

        contador--;
        System.out.println("\nRepostas em ordem inversa\n");
        for (int j = respostas.length - 1; j >= 0; j--) {
            System.out.println("Resposta " + contador + ": " + respostas[j]);
            contador--;
        }

        scanner.close();
    }
}