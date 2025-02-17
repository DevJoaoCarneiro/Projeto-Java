/*Autor.....Joao Victor
  Data......11/02/25
  Objetivo..Exercicio05 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int reiniciar;

        do {

            do {
                System.out.println("Insira um numero inteiro (maior que 0) ...");
                num = scanner.nextInt();
            } while (num <= 0);

            if (num % 2 == 0) {
                System.out.println("Seu numero e par");
            } else {
                System.out.println("Seu numero e impar");
            }

            System.out.format("Reiniciar programa?..... (1-Sim 2-Nao)");
            reiniciar = scanner.nextInt();
        } while (reiniciar == 1);
    }

}
