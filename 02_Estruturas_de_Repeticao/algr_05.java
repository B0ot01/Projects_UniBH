import java.util.Scanner;

public class algr_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número < 0 a partir da 2° pessoa para encerrar");

        double salario = 0;
        int filhos = 0;
        int contadorMedia = 0;
        double percentualSalMenor250 = 0;
        double somaSalarios = 0;
        double somaFilhos = 0;
        double mediaSalarios = 0;
        double mediaFilhos = 0;
        double mediaPesSalMenor250 = 0;
        double maiorSalario = 0;
        int i = 2;

        System.out.print("\nDigite o salário da pessoa 1: ");
        salario = scanner.nextDouble();
        maiorSalario = salario;
        contadorMedia++;
        somaSalarios += salario;

        if (salario <= 250.00) {
                percentualSalMenor250++;
            }

        System.out.print("Digite o número de filhos da pessoa 1: ");
        filhos = scanner.nextInt();
        somaFilhos += filhos;

        while (true) {

            System.out.print("\nDigite o salário da pessoa " + i + ": ");
            salario = scanner.nextDouble();
            if (salario < 0) {
                break;
            }
            somaSalarios += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 250.00) {
                percentualSalMenor250++;
            }

            System.out.print("Digite o número de filhos da pessoa " + i + ": ");
            filhos = scanner.nextInt();
            somaFilhos += filhos;
            contadorMedia++;
            i++;
        }

        mediaSalarios = somaSalarios / contadorMedia;
        mediaFilhos = somaFilhos / contadorMedia;
        mediaPesSalMenor250 = (percentualSalMenor250/contadorMedia) * 100;

        System.out.println("\nA média do salário da populaçao é: " + mediaSalarios);
        System.out.println("A média do número de filhos é: " + mediaFilhos);
        System.out.println("O maior salário é: " + maiorSalario);
        System.out.println("O Percentual de pessoas com salário até R$250,00: " + mediaPesSalMenor250 + "%\n");

        scanner.close();
    }

}
