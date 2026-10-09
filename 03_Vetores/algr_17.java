// Em um sistema de controle acadêmico, é preciso calcular a média das notas dos alunos. Escreva um programa que leia as notas de 10 alunos e, em seguida, calcule e imprima a média dessas notas.

import java.util.Scanner;

public class algr_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valoresNotas = new int[10];
        int contador = 0;
        int indicadorAluno = 1;
        int soma = 0;

        System.out.println("");
        for (int i = 0; i < valoresNotas.length; i++) {

            System.out.print("Digite a nota do aluno " + indicadorAluno + ": ");
            valoresNotas[i] = scanner.nextInt();
            soma += valoresNotas[i];
            contador++;
            indicadorAluno++;
        }

        double media = (double) soma / contador;

        System.out.println("\nA média da turma é: " + media);

        scanner.close();
    }
}