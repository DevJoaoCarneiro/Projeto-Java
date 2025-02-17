/*Nome.....Joao Victor
  Data.....11/02/2025
  Objetivo.Lista 2 exec 1*/
package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    //Função que devolve o dobro
    public static int dobro(int x) {
        return x * 2;
    }

    //Função que recebe dois numeros e retorna o maior
    public static int maior(int x, int y) {
        return Math.max(x, y);
    }

    /*Funcao que recebe dois numeros inteiros e
    retorna ture se o primeiro for multiplo do segundo */
    public static boolean numMultiplos(int x, int y) {
        if (x % y == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Funcao recebe um numero true=par false=impar    
    public static boolean parImpar(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*Função que recebe um numero real e retorna seu valor absoluto*/
    public static float numAbsoluto(float x) {
        if (x < 0) {
            return (x - (x)) + (-x);
        } else {
            return x;
        }
    }

    //Funcao que recebe 3 numeros inteiros e retorna o maior
    public static int menorDeTres(int x, int y, int z) {
        return Math.min(x, Math.min(y, z));
    }

    /*Funcao que recebe um numero e verifica se está dentro
    do intervalor de 1 a 100 */
    public static String intervaloNum(int x) {
        if (x <= 100 && x >= 0) {
            return "Esta dentro do intervalo";
        } else {
            return "Nao esta dentro do intervalo";
        }
    }

    /*Funcao que recebe dois numeros e retorna a diferença entre eles*/
    public static int diferencaModulo(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }

    public static int somaNum(int x, int y) {
        if (x > 0 && y > 0) {
            return x + y;
        } else {
            return 0;
        }
    }

    public static boolean quadradoPerfeito(int x) {
        int n;

        n = (int) Math.sqrt(x);
        /*Criei uma variavel N que é igual a raiz quadrada
                               de x. Mas antes disso fiz um casting para transformar
                               em um numero inteiro, pq ao testar n*n se for igual
                               a x é um quadrado perfeito */

        if (n * n == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void layout() {
        System.out.println("******TABELA DE OPERACOES*******");

        System.out.println("1- Dobro de um numero...........");
        System.out.println("2- Par ou Impar .................");
        System.out.println("3- Converter numero absoluto.....");
        System.out.println("4- Verifica (x>0 && x<100........");
        System.out.println("5-Verifica quadrado perfeito....");
        System.out.println("6- Multiplo do segundo numero....");
        System.out.println("7- Maior numero..................");
        System.out.println("8- Diferenca modulo..............");
        System.out.println("9- Soma de numeros positivos.....");
        System.out.println("10- Menor numero..................");

        System.out.format("---Insira sua resposta...");
    }

    public static void main(String[] args) {
        int num=0;
        int num2=0;
        int num3=0;
        int resposta;
        int reiniciar;

        Scanner scanner = new Scanner(System.in);

        do{
        layout();
        do{
        resposta = scanner.nextInt();
        if(resposta<=0 || resposta>10){
         System.out.println("Insira um numero valido");
        }
        }while(resposta<=0 || resposta>10);
        System.out.println("Insira o primeiro numero");
        num = scanner.nextInt();

        if (resposta >= 5) {
            System.out.println("Insira o segundo numero");
            num2 = scanner.nextInt();
            if (resposta == 10) {
                System.out.println("Insira o terceiro numero");
                num3 = scanner.nextInt();
            }
        }
        switch (resposta) {
            case 1:
                System.out.println("1- Dobro........................" + dobro(num));
                break;
            case 2:
                System.out.println("2- True (Par) False (Impar)....." + parImpar(num));
                break;

            case 3:
                System.out.println("3- Numero absoluto.............." + numAbsoluto(num));
                break;

            case 4:
                System.out.println("4- Intervalo de 1 a 100........." + intervaloNum(num));
                break;

            case 5:
                System.out.println("5-True (Quadrado perfeito)....." + quadradoPerfeito(num));
                break;

            case 6:
                System.out.println("6- True (Multiplo).............." + numMultiplos(num, num2));
                break;
            case 7:
                System.out.println("7- Maior........................" + maior(num, num2));
                break;
            case 8:
                System.out.println("8- Diferenca modulo............." + diferencaModulo(num, num2));
                break;
            case 9:
                System.out.println("9- Soma de numeros positivos...." + somaNum(num, num2));
                break;
            case 10:
                System.out.println("10- Menor numero................." + menorDeTres(num, num2, num3));
                break;
            default:
                System.out.println("Numero invalido");
        }
        System.out.println("\n\nReiniciar o programa (1-Sim 2-Nao)");
        reiniciar = scanner.nextInt();
        }while(reiniciar==1);
    }

}
