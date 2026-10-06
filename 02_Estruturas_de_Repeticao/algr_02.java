public class algr_02 {
    public static void main(String[] args) {
        int multiploTres = 0;
        int soma = 0;

        for (multiploTres = 1; multiploTres < 501;multiploTres+=2){
            if (multiploTres%3==0){
                soma += multiploTres;
            }
        }
        System.out.println("\nSoma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500: " + soma+"\n");
    }
}
