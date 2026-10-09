// Durante a contagem de produtos em um estoque, é necessário identificar os produtos com quantidades pares. Faça um programa que imprima todos os números pares de 1 a 50, que representam a contagem de produtos, utilizando um loop for.

public class algr_12 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int contador = 1;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] += contador;
            if (numeros[i] % 2 == 0) {
                System.out.println("Produto n° " + contador + ". Valor = " + numeros[i]);
            }
            contador++;
        }
    }
}