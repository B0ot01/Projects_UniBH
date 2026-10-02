import java.util.Scanner;

public class algr_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        double altura = 0;
        int sexo = 0;
        double somaAlturaMasculino = 0;
        double somaAlturaFeminino = 0;
        int contadorFeminino = 0;
        int contadorMasculino = 0;
        int contador = 0;
        double somaAltura = 0;
        double maiorAltura = 0;
        double menorAltura = 0;
        String nomeMaior = "";
        String nomeMenor = "";

        // Iniciar variáveis para verificar o menor e maior
        System.out.print("\nDigite o nome da pessoa 1: ");
        nome = scanner.nextLine();

        System.out.print("Digite o Sexo da pessoa 1: ( 1 = M ; 2 = F ): ");
        sexo = scanner.nextInt();
        contador++;

        System.out.print("Digite a altura da pessoa 1: ");
        altura = scanner.nextDouble();
        scanner.nextLine();
        somaAltura += altura;
        maiorAltura = altura;
        menorAltura = altura;
        nomeMaior = nome;
        nomeMenor = nome;

        if (sexo == 1) {
            contadorMasculino++;
            somaAlturaMasculino += altura;

        } else if (sexo == 2) {
            contadorFeminino++;
            somaAlturaFeminino += altura;
        }

        // fim duplicação

        for (int i = 2; i <= 15; i++) {
            System.out.print("\nDigite o nome da pessoa " + i + ": ");
            nome = scanner.nextLine();
            
            System.out.print("Digite o Sexo da pessoa " + i + ": ( 1 = M ; 2 = F ): ");
            sexo = scanner.nextInt();
            scanner.nextLine();

            contador++;

            System.out.print("Digite a altura da pessoa " + i + ": ");
            altura = Double.parseDouble(scanner.nextLine());
            somaAltura += altura;

            if (sexo == 1) {
                contadorMasculino++;
                somaAlturaMasculino += altura;

            } else if (sexo == 2) {
                contadorFeminino++;
                somaAlturaFeminino += altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaior = nome;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                nomeMenor = nome;
            }

        }

        double mediaFemin = (double) somaAlturaFeminino / contadorFeminino;
        double mediaMascu = (double) somaAlturaMasculino / contadorMasculino;
        double mediaGeral = (double) somaAltura / contador;

        System.out.println("\n" + nomeMaior + ", é o(a) maior da turma com " + maiorAltura + "m de altura.");
        System.out.println(nomeMenor + ", é o(a) menor da turma com " + menorAltura + "m de altura.");
        System.out.println("A média de altura dos Homens é: " + mediaMascu);
        System.out.println("A média de altura das mulheres é: " + mediaFemin);
        System.out.println("A média de altura geral da Turma é: " + mediaGeral);

        scanner.close();
    }
}
