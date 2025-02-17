/*Autor.....Joao Victor
  Data......11/02/25
  Objetivo..Exercicio02 */

package exercicio03;


public class Exercicio03 {

    public static void main(String[] args) {
        int num = 21;
        double num2 = 1.23f;
        float num3 = 5.4f;
        long num4 = 1516;
        
        num = (byte) num;
        num2 = (float) num2;
        num3 = (int) num3;
        num4 = (short) num4;
        
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        
        //Perda de dados no Caso 3: ao passar de float para int, ele arredonda para o menor valor
        
    }
    
}
