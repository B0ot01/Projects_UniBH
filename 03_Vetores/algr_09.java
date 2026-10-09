// Em um sistema de vendas, é necessário imprimir os recibos para os clientes. Escreva um programa que solicite ao usuário digitar a quantidade de recibos que deseja imprimir e, em seguida, imprima os números dos recibos de 1 até o número desejado utilizando um loop while.

import java.util.Scanner;

public class algr_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de recibos que você deseja: ");
        int quantidadeRecibos = scanner.nextInt();

        int[] recibos = new int[quantidadeRecibos];
        int contador = 1;
        int i = 0;

        while (contador <= quantidadeRecibos) {
            recibos[i] = contador;
            System.out.println("Recibo " + recibos[i]);
            i++;
            contador++;
        }

        scanner.close();
    }
}