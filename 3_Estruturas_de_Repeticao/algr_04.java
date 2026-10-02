import java.util.Scanner;

public class algr_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite (end) a partir do sexo da pessoa 2 para encerrar");

        double menorAltura;
        double maiorAltura;
        String sexoPesAlta = "";
        double AlturaMulheres = 0;
        int contadorMedia = 0;
        int numHomens = 0;
        double altura = 0;
        String sexo;
        int i = 1;
        double media = 0;

        System.out.print("\nDigite o sexo da pessoa " + i + " (M/F): ");
        sexo = scanner.nextLine();

        if (sexo.equalsIgnoreCase("M")) {
            numHomens = 1;
        }
        
        System.out.print("Digite a altura da pessoa " + i + " em Metros: ");
        altura = Double.parseDouble(scanner.nextLine());
        menorAltura = altura;
        maiorAltura = altura;

        if (sexo.equalsIgnoreCase("F")) {
            contadorMedia++;
            sexoPesAlta = sexo;
            AlturaMulheres += altura;
        }


        for (i = 2; i < 16; i++) {

            System.out.print("\nDigite o sexo da pessoa " + i + " (M/F): ");
            sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                numHomens++;
            }

            if (sexo.equalsIgnoreCase("END")) {
                break;
            }

            System.out.print("Digite a altura da pessoa " + i + " em Metros: ");
            altura = Double.parseDouble(scanner.nextLine());

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexoPesAlta = sexo;
            }

            if (sexo.equalsIgnoreCase("F")) {
                contadorMedia++;
                AlturaMulheres += altura;
            }

        }

        media = AlturaMulheres / contadorMedia;

        System.out.println("\nA menor altura do grupo é: " + menorAltura);
        System.out.println("A média de altura das Mulheres é: "+media);
        System.out.println("O número de Homens é: " + numHomens);
        System.out.println("O sexo da pessoa mais alta é: " + sexoPesAlta +"\n");
        scanner.close();
    }
}
