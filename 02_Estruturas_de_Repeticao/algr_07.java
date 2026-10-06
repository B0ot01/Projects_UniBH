import java.util.Scanner;

public class algr_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor < 0 para encerrar o programa\n");

        int numero = 0;
        int contador = 0;
        int somaNumeros = 0;

        for (int i = 1; i <= 75; i++) {

            System.out.print("Digite o " + i + "º número (inteiro e positivo): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            } else {
                contador++;
                somaNumeros += numero;
            }
        }

        double media = somaNumeros / contador;
        System.out.println("\nA média dos números: " + media);
        System.out.println("A quantidade de números: " + contador);

        scanner.close();
    }
}