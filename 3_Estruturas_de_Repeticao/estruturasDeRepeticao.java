import java.util.Scanner;

public class estruturasDeRepeticao {
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
            System.out.println("12\n");

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
                default:
                    System.out.println("Opçao Inválida, digite um valor válido");
            }
        }
    }

    // Algoritmo 1

    private static void algoritmo01() {
        System.out.println("Algotimo 1");

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int numero1 = 0;
        int numero2 = 0;

        while (continuar == true) {

            System.out.println("\nEscolha a operaçao aritmética desejada: \n");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtraçao");
            System.out.println("3 - Multiplicaçao");
            System.out.println("4 - Quociente");
            System.out.println("5 - Encerrar\n");
            System.out.print("Digite a opçao desejada: ");
            byte operacaoAritmetica = scanner.nextByte();

            if (operacaoAritmetica > 0 && operacaoAritmetica < 5) {
                System.out.println("\nDigite 2 números inteiros\n");
                System.out.print("Valor Primeiro Número: ");
                numero1 = scanner.nextInt();
                System.out.print("Valor Segundo Número: ");
                numero2 = scanner.nextInt();
            }

            switch (operacaoAritmetica) {

                case 1:
                    System.out.println("\nSOMA\n");
                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("\nSUBTRAÇAO\n");
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("\nMULTIPLICAÇAO\n");
                    System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("\nQuociente\n");
                    System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    System.out.println("RESTO = " + (numero1 % numero2));
                    break;
                case 5:
                    System.out.println("ALGORITMO 1 ENCERRADO");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opçao Inválida, digite um valor válido");
            }
        }

    }

    // Algoritmo 2

    private static void algoritmo02() {
        System.out.println("Algotimo 2");
        int multiploTres = 0;
        int soma = 0;

        for (multiploTres = 1; multiploTres < 501; multiploTres += 2) {
            if (multiploTres % 3 == 0) {
                soma += multiploTres;
            }
        }
        System.out.println(
                "\nSoma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500: "
                        + soma + "\n");

    }

    // Algoritmo 3

    private static void algoritmo03() {

        System.out.println("Algotimo 3");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 0 nas duas variáveis para encerrar");

        int mesFunNovo;
        int mesFunAntigo;
        int mes;
        int i = 1;
        int numeroNomeNovo = i;
        int numeroNomeAntigo = i;
        int ID = 0;
        int IDfunNovo = ID;
        int IDfunAntigo = ID;

        // Iniciar variavel
        System.out.print("\nDigite a quantos meses o funcionario " + i + " ingressou: ");
        mes = scanner.nextInt();
        mesFunNovo = mes;
        mesFunAntigo = mes;

        System.out.print("Digite o ID do funcionário " + i + ": ");
        ID = scanner.nextInt();
        IDfunAntigo = ID;
        IDfunNovo = ID;

        for (i = 2; i < 301; i++) {

            if (mes == 0 && ID == 0) {
                break;
            }

            System.out.print("\nDigite a quantos meses o funcionario " + i + " ingressou: ");
            mes = scanner.nextInt();

            System.out.print("Digite o ID do funcionário " + i + ": ");
            ID = scanner.nextInt();

            if (mes == 0 && ID == 0) {
                break;
            } else {

                if (mes < mesFunNovo) {
                    mesFunNovo = mes;
                    numeroNomeNovo = i;
                    IDfunNovo = ID;
                }

                if (mes > mesFunAntigo) {
                    mesFunAntigo = mes;
                    numeroNomeAntigo = i;
                    IDfunAntigo = ID;
                }
            }
        }

        if (mes == mesFunNovo && mes == mesFunAntigo) {
            System.out.println("\nPROGRAMA ENCERRADO\n");
        } else {
            System.out.println("\nO Funcionário " + numeroNomeNovo + ", com ID " + IDfunNovo
                    + " é o mais Novo na empresa, com um total de " + mesFunNovo + " Meses na empresa.");
            System.out.println("O Funcionário " + numeroNomeAntigo + ", com ID " + IDfunAntigo
                    + " é o mais Velho na empresa, com um total de " + mesFunAntigo + " Meses na empresa.\n");
        }
    }

    // Algoritmo 4

    private static void algoritmo04() {
        System.out.println("Algotimo 4");
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
        System.out.println("A média de altura das Mulheres é: " + media);
        System.out.println("O número de Homens é: " + numHomens);
        System.out.println("O sexo da pessoa mais alta é: " + sexoPesAlta + "\n");
    }

    // Algoritmo 5

    private static void algoritmo05() {
        System.out.println("Algotimo 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número < 0 a partir da 2° pessoa para encerrar");

        double salario = 0;
        int filhos = 0;
        int contadorMedia = 0;
        double percentualSalMenor250 = 0;
        double somaSalarios = 0;
        double somaFilhos = 0;
        double mediaSalarios = 0;
        double mediaFilhos = 0;
        double mediaPesSalMenor250 = 0;
        double maiorSalario = 0;
        int i = 2;

        System.out.print("\nDigite o salário da pessoa 1: ");
        salario = scanner.nextDouble();
        maiorSalario = salario;
        contadorMedia++;
        somaSalarios += salario;

        if (salario <= 250.00) {
            percentualSalMenor250++;
        }

        System.out.print("Digite o número de filhos da pessoa 1: ");
        filhos = scanner.nextInt();
        somaFilhos += filhos;

        while (true) {

            System.out.print("\nDigite o salário da pessoa " + i + ": ");
            salario = scanner.nextDouble();
            if (salario < 0) {
                break;
            }
            somaSalarios += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 250.00) {
                percentualSalMenor250++;
            }

            System.out.print("Digite o número de filhos da pessoa " + i + ": ");
            filhos = scanner.nextInt();
            somaFilhos += filhos;
            contadorMedia++;
            i++;
        }

        mediaSalarios = somaSalarios / contadorMedia;
        mediaFilhos = somaFilhos / contadorMedia;
        mediaPesSalMenor250 = (percentualSalMenor250 / contadorMedia) * 100;

        System.out.println("\nA média do salário da populaçao é: " + mediaSalarios);
        System.out.println("A média do número de filhos é: " + mediaFilhos);
        System.out.println("O maior salário é: " + maiorSalario);
        System.out.println("O Percentual de pessoas com salário até R$250,00: " + mediaPesSalMenor250 + "%\n");

    }

    // Algoritmo 6

    private static void algoritmo06() {
        System.out.println("Algotimo 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 0 para finalizar o programa\n");

        double numero = 0;
        int contador = 0;
        int contadorNumPositivos = 0;
        int contadorNumNegativos = 0;
        double somaNumeros = 0;
        double mediaArtimetica = 0;
        double percValPos = 0;
        double percValNeg = 0;

        while (true) {

            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();
            if (numero == 0) {
                break;
            }
            contador++;
            somaNumeros += numero;

            if (numero > 0) {
                contadorNumPositivos++;
            }

            if (numero < 0) {
                contadorNumNegativos++;
            }
        }

        mediaArtimetica = somaNumeros / contador;

        if (contadorNumNegativos == 0) {
            percValPos = 100;
        } else if (contadorNumPositivos == 0) {
            percValNeg = 100;
        } else {
            percValPos = ((double) contadorNumPositivos / contador) * 100;
            percValNeg = ((double) contadorNumNegativos / contador) * 100;
        }

        System.out.println("\nA Média Aritmética é: " + mediaArtimetica);
        System.out.println("O total de números Positivos: " + contadorNumPositivos);
        System.out.println("O total de números Negativos: " + contadorNumNegativos);
        System.out.println("A porcentagem de valores Negativos é: " + percValNeg + "%, e valores positivos é: "
                + percValPos + "%\n");
    }

    // Algoritmo 7

    private static void algoritmo07() {
        System.out.println("Algotimo 7");
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

    }

    // Algoritmo 8

    private static void algoritmo08() {
        System.out.println("Algotimo 8");
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
    }

    // Algoritmo 9

    private static void algoritmo09() {
        System.out.println("Algotimo 9");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor < 0 para interromper o programa\n");
        int maiorNota = 0;
        int menorNota = 0;
        int nota = 0;
        int i = 1;

        System.out.println("Digite uma nota entre 0 - 15\n");
        System.out.print("Digite a nota " + i + ": ");
        nota = scanner.nextInt();
        maiorNota = nota;
        menorNota = nota;
        i++;

        while (true) {

            System.out.print("Digite a nota " + i + ": ");
            nota = scanner.nextInt();
            i++;
            if (nota < 0) {
                break;
            } else {
                if (nota > maiorNota) {
                    maiorNota = nota;
                }

                if (nota < menorNota) {
                    menorNota = nota;
                }
            }
        }

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);

    }

    // Algoritmo 10

    private static void algoritmo10() {
        System.out.println("Algotimo 10\n");

        double polegada = 1;
        double centimetro = 2.54;

        for (polegada = 1; polegada <= 20; polegada++) {
            System.out.println(polegada + " Polegada em Centímetro: " + (polegada * centimetro));
        }

    }

    // Algoritmo 11

    private static void algoritmo11() {
        System.out.println("Algotimo 11");
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
                soma += i;
            }
        }
        System.out.println("\nA soma de todos os números pares no intervalo de " + num1 + " - " + num2 + " = " + soma);

    }

    // Algoritmo 12

    private static void algoritmo12() {
        System.out.println("Algotimo 12");
        Scanner scanner = new Scanner(System.in);

        int numMatricula = 0;
        int numMatriculaMaior1 = 0;
        int numMatriculaMaior2 = 0;
        int nota = 0;
        int maiorNota1 = 0;
        int maiorNota2 = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("\nDigite a matrícula do aluno " + i + ": ");
            numMatricula = scanner.nextInt();

            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = scanner.nextInt();

            if (nota > maiorNota1) {
                maiorNota2 = maiorNota1;
                maiorNota1 = nota;
                numMatriculaMaior2 = numMatriculaMaior1;
                numMatriculaMaior1 = numMatricula;

            } else if (nota > maiorNota2) {
                maiorNota2 = nota;
                numMatriculaMaior2 = numMatricula;
            }

        }
        System.out.println("\nA maior nota é: " + maiorNota1 + ", matrícula: " + numMatriculaMaior1);
        System.out.println("A segunda maior nota é: " + maiorNota2 + ", matrícula: " + numMatriculaMaior2);

    }
}