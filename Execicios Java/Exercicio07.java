/*Autor.....Joao Victor
  Data......11/02/25
  Objetivo..Exercicio07 */
package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        int num;
        int numMulti;
        int i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para gerar uma tabuada");
        num = scanner.nextInt();

        for (i = 0; i < 11; i++) {
            if (i == 0) {
                System.out.format("%d X %d = 1\n", num, i);
            }else{
            numMulti = num * i;
            System.out.format("%d X %d = %d\n", num, i, numMulti);
            }
        }

    }

}
