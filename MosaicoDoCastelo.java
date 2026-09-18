import java.util.Scanner;

public class MosaicoDoCastelo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        System.out.println("--- DIMENSAO " + n + " x " + n + " ---");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // Cantos
                if ((i == 0 || i == n - 1) && (j == 0 || j == n - 1)) {
                    System.out.print("+");

                    // Bordas
                } else if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("#");

                    // Interior
                } else {
                    System.out.print(".");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
