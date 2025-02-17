/*Autor.....Joao Victor
  Data......11/02/25
  Objetivo..Exercicio04 */
package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {
        int num = 12;
        int num2 = 34;
        int num3 = 45;

        if (num > num2 && num != num3) {
            System.out.println("1-Seu num e maior que num2 e num e diferente de num3");
        } else if (num2 < num3 || num2 < num) {
            System.out.println("2-Seu num2 e maior que num3 ou num2 e menor que num");
        } else if (num == 43) {
            System.out.println("3-Seu numero e 43");
        } else if (!(num3 > 45)) {
            System.out.println("4-Isso e ilogico");
        }else{
            System.out.println("Passou por todas as condicoes");
        }
    }

}
