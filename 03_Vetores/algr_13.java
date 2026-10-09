// Em um sistema de segurança, é importante identificar números primos para gerar chaves de acesso. Crie um programa que solicite ao usuário inserir um número inteiro N e, em seguida, imprima todos os números primos menores ou iguais a N.

import java.util.Scanner;

public class algr_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número limite: ");
        int numeroLimite = scanner.nextInt();

        int[] numero = new int[numeroLimite];
        int primo = 0;

        if (numeroLimite <= 1) {
            System.out.println("Nao existem números primos <= " + numeroLimite);
        } else {

            for (int i = 0; i < numero.length; i++) {
                numero[i] = i + 1;
            }

            System.out.println("\nTodos os números primos <= " + numeroLimite + "\n");

            for (int j = 0; j < numero.length; j++) {

                for (int l = 1; l <= numero[j]; l++) {
                    if (numero[j] % l == 0) {
                        primo++;
                    }
                }

                if (primo == 2) {
                    System.out.println(numero[j]);
                }
                primo = 0;
            }
        }
        scanner.close();
    }
}