// Um laboratório de pesquisa coleta dados de temperatura em diferentes regiões. Escreva um programa que solicite ao usuário digitar 10 valores de temperatura e, em seguida, calcule e imprima a temperatura média dessas regiões.

import java.util.Scanner;

public class algr_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valoresTemperatura = new int[10];
        int contador = 0;
        int soma = 0;
        int indicadorRegiao = 1;

        System.out.println("");
        for (int i = 0; i < valoresTemperatura.length; i++) {

            System.out.print("Digite o valor da temperatura na regiao " + indicadorRegiao + ": ");
            valoresTemperatura[i] = scanner.nextInt();
            soma += valoresTemperatura[i];
            contador++;
            indicadorRegiao++;
        }

        double media = (double) soma / contador;

        System.out.println("\nA média de temperatura nessas regioes é: " + media);

        scanner.close();
    }
}