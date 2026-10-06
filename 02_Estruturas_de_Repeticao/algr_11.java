import java.util.Scanner;

public class algr_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int soma = 0;

        System.out.print("\nDigite o número de início: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o número de fim: ");
        num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                soma+=i;
            }
        }System.out.println("\nA soma de todos os números pares no intervalo de "+num1+" - "+num2+" = "+soma);

        scanner.close();
    }
}
