import java.util.Scanner;

public class MosaicoDoCastelo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro> 1){
            // Cabeçalho

            System.out.printf("--- DIMENSAO %d x %d ---\n", numeroInteiro, numeroInteiro);

            System.out.print("+");
            for (int i = 3; i <= numeroInteiro; i++) {
                System.out.print("#");
            }
            System.out.println("+");

            // Corpo

            if (numeroInteiro > 2) {
                for (int i = 3; i <= numeroInteiro; i++) {
                    System.out.print("#");
                    System.out.print(".".repeat(numeroInteiro - 2));
                    System.out.println("#");
                }
            }

            // Base

            System.out.print("+");
            for (int i = 3; i <= numeroInteiro; i++) {
                System.out.print("#");
            }
            System.out.println("+");
        }
        else if (numeroInteiro == 1){
            System.out.printf("--- DIMENSAO %d x %d ---\n", numeroInteiro, numeroInteiro);
            System.out.print("+");
        }
        else{
            System.out.print("Digite um numero > 0");
        }
        scanner.close();
    }
}