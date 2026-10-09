// Em uma fábrica, é necessário calcular o tempo de produção de um produto com base no número de etapas necessárias. Escreva um programa que leia um número inteiro positivo correspondente ao número de etapas de produção e, em seguida, calcule e imprima o tempo total de produção.

import java.util.Scanner;

public class algr_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número correspondente ao n° de etapas de produçao: ");
        int numeroEtapas = scanner.nextInt();

        float tempo = 0;
        float somaTempo = 0;
        float[] guardarValoresTempo = new float[numeroEtapas];

        System.out.println("");
        for (int i = 1; i <= numeroEtapas; i++) {
            System.out.print("Digite o tempo em minutos na etapa " + i + ": ");
            tempo = scanner.nextFloat();
            somaTempo += tempo;
            guardarValoresTempo[i - 1] = (float) tempo;
        }

        // TESTE array ~guardarValoresTempo

        // for(int i = 0; i < guardarValoresTempo.length; i++){
        // System.out.println(guardarValoresTempo[i]);
        // }

        System.out.println("\nTempo total de produçao: " + somaTempo);

        scanner.close();
    }
}