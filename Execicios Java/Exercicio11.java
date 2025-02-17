/*Nome.....Joao Victor
  Data.....17/02/2025
  Objetivo.Lista 2 Exercicio 21 a 30 */
package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    //Funcao verificar se o numero é primo
    public static boolean numInteiro(int x) {
        int i;

        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Verificar se é impar e maior que 50
    public static boolean imparMaior(int x) {
        return x % 2 != 0 && x > 50;
    }

    //Funcao verificar se um dos dois é par
    public static boolean umNumPar(int x, int y) {
        return x % 2 == 0 || y % 2 == 0;
    }

    //Funcao verifica se é multiplo de 3 e 5 ao mesmo tempo
    public static boolean numMultiplo(int x) {
        return x % 3 == 0 & x % 5 == 0;
    }

    //Verificar se os 3 numeros sao diferentes
    public static boolean testeIguais(int x, int y, int z) {
        return x != y && y != z && x != z;
    }

    //Descobrir a raiz de um numero inteiro
    public static int raizQuadrada(int x) {
        int i;
        int num = 0;

        for (i = 0; i < x; i++) {
            num = i * i;

            if (num == x) {
                return i;
            }
        }
        return 0;
    }

    //Funcao que recebe a potencia do primeiro elevado ao segundo
    public static int potenciaNum(int x, int y) {
        int i;
        int num = x;

        for (i = 1; i < y; i++) {
            num = num*x;
        }
        return num;
    }

    //Funcao que recebe um numero e retorne seu fatorial
    public static int numFatorial(int x) {
        int i;
        int num = x;
        if (x != 0) {
            for (i = x - 1; i > 0; i--) {
                num = num * i;
            }
            return num;
        } else {
            return 1;
        }
    }

    //Funcao que receba um numero e retorne true se for numero perfeito
    public static boolean numPerfeito(int x) {
        int i;
        int num = 0;

        for (i = 1; i < x; i++) {
            if (x % i == 0) {
                num = num + i;
            }
        }
        return num == x;
    }

    //Verifica se está dentro de 10 a 30 ou é negativo
    public static boolean testNum(int x) {
        return (x >= 10 && x <= 30 || x < 0);
    }

    public static void layout() {
        System.out.println("MENU DE OPCOES");
        System.out.println("1-Funcao verificar se o numero eh primo...............................");
        System.out.println("2-Verificar se eh impar e maior que 50................................");
        System.out.println("3-Funcao verificar se um dos dois eh par..............................");
        System.out.println("4-Funcao verifica se eh multiplo de 3 e 5 ao mesmo tempo..............");
        System.out.println("5-Verificar se os 3 numeros sao diferentes...........................");
        System.out.println("6-Descobrir a raiz de um numero inteiro..............................");
        System.out.println("7-Funcao que recebe a potencia do primeiro elevado ao segundo .......");
        System.out.println("8-Funcao que recebe um numero e retorne seu fatorial ................");
        System.out.println("9-Funcao que receba um numero e retorne true se for numero perfeito..");
        System.out.println("10-Verifica se esta dentro de 10 a 30 ou eh negativo..................");
        System.out.format("Resposta.....");
    }

    public static void main(String[] args) {
        int escolha;
        int reiniciar;
        int x;
        int y;
        int z;

        do {
            Scanner scanner = new Scanner(System.in);
            layout();
            do {
                escolha = scanner.nextInt();
                if (escolha <= 0 || escolha > 10) {
                    System.out.println("Insira um numero valido");
                }
            } while (escolha <= 0 || escolha > 10);
            System.out.format("Digite um numero.....");
            x = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(numInteiro(x));
                    break;
                case 2:
                    System.out.println(imparMaior(x));
                    break;
                case 3:
                    System.out.format("Digite outro numero.....");
                    y = scanner.nextInt();
                    System.out.println(umNumPar(x, y));
                    break;
                case 4:
                    System.out.println(numMultiplo(x));
                    break;
                case 5:
                    System.out.format("Digite segundo numero.....");
                    y = scanner.nextInt();
                    System.out.format("Digite terceiro numero.....");
                    z = scanner.nextInt();
                    System.out.println(testeIguais(x, y, z));
                    break;
                case 6:
                    System.out.println(raizQuadrada(x));
                    break;
                case 7:
                    System.out.format("Digite outro numero.....");
                    y = scanner.nextInt();
                    System.out.println(potenciaNum(x, y));
                    break;
                case 8:
                    System.out.println(numFatorial(x));
                    break;
                case 9:
                    System.out.println(numPerfeito(x));
                    break;
                case 10:
                    System.out.println(testNum(x));
                    break;
            }
            System.out.format("\nReiniciar o programa (1-Sim 2-Nao)");
            reiniciar = scanner.nextInt();
        } while (reiniciar == 1);

    }

}
