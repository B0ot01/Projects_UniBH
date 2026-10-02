import java.util.Scanner;

public class algr_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMatricula = 0;
        int numMatriculaMaior1 = 0;
        int numMatriculaMaior2 = 0;
        int nota = 0;
        int maiorNota1 = 0;
        int maiorNota2 = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("\nDigite a matrícula do aluno "+i+": ");
            numMatricula = scanner.nextInt();

            System.out.print("Digite a nota do aluno "+i+": ");
            nota = scanner.nextInt();

            if (nota > maiorNota1){
                maiorNota2 = maiorNota1;
                maiorNota1 = nota;
                numMatriculaMaior2 = numMatriculaMaior1;
                numMatriculaMaior1 = numMatricula;
                
            }else if(nota > maiorNota2){
                maiorNota2 = nota;
                numMatriculaMaior2 = numMatricula;
            }

        }System.out.println("\nA maior nota é: "+maiorNota1+", matrícula: "+numMatriculaMaior1);
        System.out.println("A segunda maior nota é: "+maiorNota2+", matrícula: "+numMatriculaMaior2);

        scanner.close();
    }
}
