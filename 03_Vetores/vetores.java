import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar == true) {

            System.out.println("\nEscolha o algoritmo desejado: \n");
            System.out.println("0 - Encerrar");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
            System.out.println("11");
            System.out.println("12");
            System.out.println("13");
            System.out.println("14");
            System.out.println("15");
            System.out.println("16");
            System.out.println("17");
            System.out.println("18");
            System.out.println("19");
            System.out.println("20\n");

            System.out.print("Digite a opçao desejada: ");
            int escolhaAlgoritmo = scanner.nextInt();

            switch (escolhaAlgoritmo) {
                case 0:
                    System.out.println("Programa Encerrado");
                    continuar = false;
                    scanner.close();
                    break;
                case 1:
                    algoritmo01();
                    break;
                case 2:
                    algoritmo02();
                    break;
                case 3:
                    algoritmo03();
                    break;
                case 4:
                    algoritmo04();
                    break;
                case 5:
                    algoritmo05();
                    break;
                case 6:
                    algoritmo06();
                    break;
                case 7:
                    algoritmo07();
                    break;
                case 8:
                    algoritmo08();
                    break;
                case 9:
                    algoritmo09();
                    break;
                case 10:
                    algoritmo10();
                    break;
                case 11:
                    algoritmo11();
                    break;
                case 12:
                    algoritmo12();
                    break;
                case 13:
                    algoritmo13();
                    break;
                case 14:
                    algoritmo14();
                    break;
                case 15:
                    algoritmo15();
                    break;
                case 16:
                    algoritmo16();
                    break;
                case 17:
                    algoritmo17();
                    break;
                case 18:
                    algoritmo18();
                    break;
                case 19:
                    algoritmo19();
                    break;
                case 20:
                    algoritmo20();
                    break;
                default:
                    System.out.println("Opçao Inválida, digite um valor válido");
            }
        }
    }

    // Algoritmo 1

    private static void algoritmo01() {
        System.out.println("Algotimo 1\n");

        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[10];
        int primo = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite o numero do vetor " + i + ": ");
            numero[i] = scanner.nextInt();
        }

        System.out.println("\nPosisoes 0 - 9 ");

        for (int j = 0; j < numero.length; j++) {

            for (int l = 1; l <= numero[j]; l++) {
                if (numero[j] % l == 0) {
                    primo++;
                }
            }

            if (primo == 2) {
                System.out.println("Número " + numero[j] + ", " + j + "° posiçao. É primo");
            }
            primo = 0;
        }
    }

    // Algoritmo 2

    private static void algoritmo02() {
        System.out.println("Algotimo 2");

        Scanner scanner = new Scanner(System.in);

        int[] numerosVetor1 = new int[10];
        int[] numerosVetor2 = new int[10];
        int[] somaVetor3 = new int[20];
        int contador = 0;

        System.out.println("--VETOR 1--\n");
        for (int i = 0; i < numerosVetor1.length; i++) {
            System.out.print("Digite o número do vetor " + i + ": ");
            numerosVetor1[i] = scanner.nextInt();
        }

        System.out.println("\n--VETOR 2--\n");
        for (int j = 0; j < numerosVetor2.length; j++) {
            System.out.print("Digite o número do vetor " + j + ": ");
            numerosVetor2[j] = scanner.nextInt();
        }

        for (int k = 0; k < 10; k++) {
            somaVetor3[contador] = numerosVetor1[k];
            contador++;
            somaVetor3[contador] = numerosVetor2[k];
            contador++;
        }

        System.out.println("\n--VETOR 3--\n");
        for (int l = 0; l < somaVetor3.length; l++) {
            System.out.println(somaVetor3[l]);
        }

    }

    // Algoritmo 3

    private static void algoritmo03() {

        System.out.println("Algotimo 3");

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do vetor " + i + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            contador++;
        }

        float media = (float) soma / contador;
        System.out.println("\nA média dos valores é: " + media);

    }

    // Algoritmo 4

    private static void algoritmo04() {
        System.out.println("Algotimo 4");

        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[20];
        int posicao = 0;
        Boolean validacao = false;

        System.out.println("Digite um número inteiro entre 1 - 30\n");
        for (int i = 0; i < numero.length; i++) {

            System.out.print("Digite o número do vetor " + i + ": ");
            numero[i] = scanner.nextInt();

            if (numero[i] > 0 && numero[i] <= 30) {
                if (numero[i] == 25) {
                    posicao = i;
                    validacao = true;
                }
            } else {
                System.out.println("\nERRO! \nSeu número deve estar entre 1 - 30\n");
                i--;
            }
        }

        if (validacao == true) {
            System.out.println("\nSeu Vetor contém o número 25 no vetor de posiçao " + posicao + "!!!");
        } else {
            System.out.println("\nSeu Vetor nao possui o número 25");
        }

    }

    // Algoritmo 5

    private static void algoritmo05() {
        System.out.println("Algotimo 5");

        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[15];
        int posicao = 0;
        Boolean validacao = false;

        System.out.println("Digite um número inteiro entre 1 - 50\n");
        for (int i = 0; i < numero.length; i++) {

            System.out.print("Digite o número do vetor " + i + ": ");
            numero[i] = scanner.nextInt();

            if (numero[i] > 0 && numero[i] <= 50) {
                if (numero[i] == 20) {
                    posicao = i;
                    validacao = true;
                }
            } else {
                System.out.println("\nERRO! \nSeu número deve estar entre 1 - 50\n");
                i--;
            }
        }

        if (validacao == true) {
            System.out.println("\nSeu Vetor contém o número 20 no vetor de posiçao " + posicao + "!!!");
        } else {
            System.out.println("\nSeu Vetor nao possui o número 20");
        }

    }

    // Algoritmo 6

    private static void algoritmo06() {
        System.out.println("Algotimo 6");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numero = new int[30];
        int numeroExcluirVetor;
        Boolean casoContrario = true;

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(1, 101);
        }

        System.out.print("\nDigite um número aleatório: ");
        numeroExcluirVetor = scanner.nextInt();

        for (int j = 0; j < numero.length; j++) {
            if (numero[j] == numeroExcluirVetor) {
                numero[j] = 0;
                casoContrario = false;
            }
        }

        if (casoContrario == true) {
            System.out.println("O número indicado nao consta no Vetor, portanto nao foi removido");
        } else {
            System.out.println("O numero " + numeroExcluirVetor + " consta no vetor. Entao foi removido");
        }

    }

    // Algoritmo 7

    private static void algoritmo07() {
        System.out.println("Algotimo 7");

        Scanner scanner = new Scanner(System.in);
        float[] numero = new float[5];
        float maiorNumero = 0;
        float menorNumero = 0;

        System.out.print("Digite o valor do vetor 0: ");
        numero[0] = scanner.nextFloat();
        maiorNumero = numero[0];
        menorNumero = numero[0];

        for (int i = 1; i < numero.length; i++) {
            System.out.print("Digite o valor do vetor " + i + ": ");
            numero[i] = scanner.nextFloat();

            if (numero[i] > maiorNumero) {
                maiorNumero = numero[i];
            }

            if (numero[i] < menorNumero) {
                menorNumero = numero[i];
            }
        }

        System.out.println("\nO maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

    }

    // Algoritmo 8

    private static void algoritmo08() {
        System.out.println("Algotimo 8");

        Random random = new Random();

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(1, 999);
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor A\n");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor" + i + ": " + vetorA[i]);
        }

        System.out.println("\nVetor B em ordem inversa\n");
        for (int i = vetorB.length - 1; i >= 0; i--) {
            System.out.println("Vetor" + i + ": " + vetorB[i]);
        }

    }

    // Algoritmo 9

    private static void algoritmo09() {
        System.out.println("Algotimo 9");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de recibos que você deseja: ");
        int quantidadeRecibos = scanner.nextInt();

        int[] recibos = new int[quantidadeRecibos];
        int contador = 1;
        int i = 0;

        while (contador <= quantidadeRecibos) {
            recibos[i] = contador;
            System.out.println("Recibo " + recibos[i]);
            i++;
            contador++;
        }

    }

    // Algoritmo 10

    private static void algoritmo10() {
        System.out.println("Algotimo 10\n");

        Scanner scanner = new Scanner(System.in);

        int[] armazenarValoresTabuada = new int[10];
        int contador = 0;
        int resultado = 0;

        System.out.print("Digite um número para ser calculado: ");
        int numeroTabuada = scanner.nextInt();

        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            resultado = numeroTabuada * i;
            System.out.println(numeroTabuada + " * " + i + " = " + resultado);
            armazenarValoresTabuada[contador] = resultado;
            contador++;
        }

    }

    // Algoritmo 11

    private static void algoritmo11() {
        System.out.println("Algotimo 11");

        Scanner scanner = new Scanner(System.in);

        int[] valoresTemperatura = new int[10];
        int contador = 0;
        int soma = 0;
        int indicadorRegiao = 1;

        System.out.println("");
        for (int i = 0; i < valoresTemperatura.length; i++) {

            System.out.print("Digite o valor da temperatura na regiao " + indicadorRegiao + ": ");
            valoresTemperatura[i] = scanner.nextInt();
            soma += valoresTemperatura[i];
            contador++;
            indicadorRegiao++;
        }

        double media = (double) soma / contador;

        System.out.println("\nA média de temperatura nessas regioes é: " + media);

    }

    // Algoritmo 12

    private static void algoritmo12() {
        System.out.println("Algotimo 12");

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

    // Algoritmo 13

    private static void algoritmo13() {
        System.out.println("Algotimo 13");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número limite: ");
        int numeroLimite = scanner.nextInt();

        int[] numero = new int[numeroLimite];
        int primo = 0;

        if (numeroLimite <= 1) {
            System.out.println("Nao existem números primos <= " + numeroLimite);
        } else {

            for (int i = 0; i < numero.length; i++) {
                numero[i] = i + 1;
            }

            System.out.println("\nTodos os números primos <= " + numeroLimite + "\n");

            for (int j = 0; j < numero.length; j++) {

                for (int l = 1; l <= numero[j]; l++) {
                    if (numero[j] % l == 0) {
                        primo++;
                    }
                }

                if (primo == 2) {
                    System.out.println(numero[j]);
                }
                primo = 0;
            }
        }

    }

    // Algoritmo 14

    private static void algoritmo14() {
        System.out.println("Algotimo 14");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número correspondente ao n° de etapas de produçao: ");
        int numeroEtapas = scanner.nextInt();

        float tempo = 0;
        float somaTempo = 0;
        float[] guardarValoresTempo = new float[numeroEtapas];

        System.out.println("");
        for (int i = 1; i <= numeroEtapas; i++) {
            System.out.print("Digite o tempo em minutos na etapa " + i + ": ");
            tempo = scanner.nextFloat();
            somaTempo += tempo;
            guardarValoresTempo[i - 1] = (float) tempo;
        }

        // TESTE array ~guardarValoresTempo

        // for(int i = 0; i < guardarValoresTempo.length; i++){
        // System.out.println(guardarValoresTempo[i]);
        // }

        System.out.println("\nTempo total de produçao: " + somaTempo);

    }

    // Algoritmo 15

    private static void algoritmo15() {
        System.out.println("Algotimo 15");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        int num = scanner.nextInt() - 1;
        int num1 = 0;
        int termoatual = 0;
        int proxtermo = 1;
        int soma = 1;
        int[] guardarValoresFibonacci = new int[num + 1];
        int i = 1;

        System.out.print("\nSequência de Fibonacci: " + 0 + " ");
        while (!(num1 == num)) {
            System.out.print(soma + " ");
            guardarValoresFibonacci[i] = soma;
            soma = termoatual + proxtermo;
            termoatual = proxtermo;
            proxtermo = soma;
            num1++;
            i++;
        }

        /*
         * TESTE VETOR
         * 
         * System.out.println("");
         * System.out.print("\nValor vetor: ");
         * for (i = 0; i < guardarValoresFibonacci.length;i++){
         * System.out.print(guardarValoresFibonacci[i]+" ");
         * }
         */

    }

    // Algoritmo 16

    private static void algoritmo16() {
        System.out.println("Algotimo 16");

        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[5];

        int contador = 1;

        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Digite a resposta da opiniao " + contador + ": ");
            respostas[i] = scanner.nextLine();
            contador++;
        }

        contador--;
        System.out.println("\nRepostas em ordem inversa\n");
        for (int j = respostas.length - 1; j >= 0; j--) {
            System.out.println("Resposta " + contador + ": " + respostas[j]);
            contador--;
        }

    }

    // Algoritmo 17

    private static void algoritmo17() {
        System.out.println("Algotimo 17");

        Scanner scanner = new Scanner(System.in);

        int[] valoresNotas = new int[10];
        int contador = 0;
        int indicadorAluno = 1;
        int soma = 0;

        System.out.println("");
        for (int i = 0; i < valoresNotas.length; i++) {

            System.out.print("Digite a nota do aluno " + indicadorAluno + ": ");
            valoresNotas[i] = scanner.nextInt();
            soma += valoresNotas[i];
            contador++;
            indicadorAluno++;
        }

        double media = (double) soma / contador;

        System.out.println("\nA média da turma é: " + media);

    }

    // Algoritmo 18

    private static void algoritmo18() {
        System.out.println("Algotimo 18");

        Scanner scanner = new Scanner(System.in);
        float[] numero = new float[8];
        float maiorNumero = 0;
        float menorNumero = 0;

        System.out.print("Digite o valor da temperatura 1: ");
        numero[0] = scanner.nextFloat();
        maiorNumero = numero[0];
        menorNumero = numero[0];
        int indicadorNumeroTemperatura = 2;

        for (int i = 1; i < numero.length; i++) {
            System.out.print("Digite o valor da temperatura " + indicadorNumeroTemperatura + ": ");
            numero[i] = scanner.nextFloat();

            if (numero[i] > maiorNumero) {
                maiorNumero = numero[i];
            }

            if (numero[i] < menorNumero) {
                menorNumero = numero[i];
            }
            indicadorNumeroTemperatura++;
        }

        System.out.println("\nA maior temperatura é: " + maiorNumero);
        System.out.println("A menor temperatura é: " + menorNumero);

    }

    // Algoritmo 19

    private static void algoritmo19() {
        System.out.println("Algotimo 19");

        Scanner scanner = new Scanner(System.in);

        int[] produtos = { 101, 205, 310, 450, 520 };

        System.out.print("Digite o código de procura: ");
        int codigoProcura = scanner.nextInt();

        Boolean verificacao = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == codigoProcura) {
                System.out.println("\nCódigo " + codigoProcura + " ENCONTRADO");
                verificacao = true;
                break;
            }
        }

        if (verificacao == false) {
            System.out.println("\nCódigo NAO ENCONTRADO");
        }

    }

    // Algoritmo 20

    private static void algoritmo20() {
        System.out.println("Algotimo 20");

        Scanner scanner = new Scanner(System.in);

        float[] numeros = new float[10];
        int contadorPrecos = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do preço " + contadorPrecos + ": ");
            numeros[i] = scanner.nextFloat();
            contadorPrecos++;
        }

        Arrays.sort(numeros);

        contadorPrecos = 1;
        System.out.println("\nOrdem dos preços organizados");
        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Preço " + contadorPrecos + " = " + numeros[j]);
            contadorPrecos++;
        }

    }
}