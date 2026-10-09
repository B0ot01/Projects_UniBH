// Em um sistema de monitoramento de temperaturas, é importante identificar a temperatura mais alta registrada. Faça um programa que leia 8 valores de temperatura e, em seguida, encontre e imprima a maior temperatura registrada.

import java.util.Scanner;

public class algr_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numero = new float[8];
        float maiorNumero = 0;
        float menorNumero = 0;

        System.out.print("Digite o valor da temperatura 1: ");
        numero[0] = scanner.nextFloat();
        maiorNumero = numero[0];
        menorNumero = numero[0];
        int indicadorNumeroTemperatura = 2;

        for (int i = 1; i < numero.length; i++) {
            System.out.print("Digite o valor da temperatura " + indicadorNumeroTemperatura + ": ");
            numero[i] = scanner.nextFloat();

            if (numero[i] > maiorNumero) {
                maiorNumero = numero[i];
            }

            if (numero[i] < menorNumero) {
                menorNumero = numero[i];
            }
            indicadorNumeroTemperatura++;
        }

        System.out.println("\nA maior temperatura é: " + maiorNumero);
        System.out.println("A menor temperatura é: " + menorNumero);

        scanner.close();
    }
}