// Um sistema de gerenciamento de projetos precisa gerar estimativas de prazos com base em sequências de tarefas. Faça um programa que solicite ao usuário inserir um número inteiro positivo N e, em seguida, gere e imprima os N primeiros termos da sequência de Fibonacci, que representa os prazos estimados.

import java.util.Scanner;

public class algr_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        int num = scanner.nextInt() - 1;
        int num1 = 0;
        int termoatual = 0;
        int proxtermo = 1;
        int soma = 1;
        int[] guardarValoresFibonacci = new int[num + 1];
        int i = 1;

        System.out.print("\nSequência de Fibonacci: " + 0 + " ");
        while (!(num1 == num)) {
            System.out.print(soma + " ");
            guardarValoresFibonacci[i] = soma;
            soma = termoatual + proxtermo;
            termoatual = proxtermo;
            proxtermo = soma;
            num1++;
            i++;
        }

        /*
         * TESTE VETOR
         * 
         * System.out.println("");
         * System.out.print("\nValor vetor: ");
         * for (i = 0; i < guardarValoresFibonacci.length;i++){
         * System.out.print(guardarValoresFibonacci[i]+" ");
         * }
         */

        scanner.close();
    }
}