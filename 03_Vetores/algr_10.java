// Em uma escola, os professores precisam ensinar a tabuada aos alunos. Crie um programa que peça ao usuário inserir um número inteiro correspondente à tabuada desejada e, em seguida, imprima a tabuada desse número até 10.

import java.util.Scanner;

public class algr_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] armazenarValoresTabuada = new int[10];
        int contador = 0;
        int resultado = 0;

        System.out.print("Digite um número para ser calculado: ");
        int numeroTabuada = scanner.nextInt();

        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            resultado = numeroTabuada * i;
            System.out.println(numeroTabuada + " * " + i + " = " + resultado);
            armazenarValoresTabuada[contador] = resultado;
            contador++;
        }

        scanner.close();
    }
}