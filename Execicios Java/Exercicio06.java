/*Autor.....Joao Victor
  Data......11/02/25
  Objetivo..Exercicio05 */

package exercicio06;

import java.util.Scanner;


public class Exercicio06 {
    
    public static void main(String[] args) {
        float num;
        float num2;
        float num3;
        int escolha;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Insira o primeiro valor");
        num = scanner.nextFloat();
        
        System.out.println("Insira o segundo valor");
        num2 = scanner.nextFloat();
        
        do{
        System.out.format("Qual operacao voce quer realizar?\n1-Adicao\n2-Subtracao\n3-Divisao\n4-Multiplicacao\n Resposta...");
        escolha = scanner.nextInt();
        }while(escolha > 4 || escolha <= 0);
        
        switch (escolha){
            case 1:   
                num3 = num + num2;
                System.out.println("Resultado..."+num3);
                break;
            case 2:   
                num3 = num - num2;
                System.out.println("Resultado..."+num3);
                break;
            case 3:   
                num3 = num / num2;
                System.out.println("Resultado..."+num3);
                break;
            case 4:   
                num3 = num * num2;
                System.out.println("Resultado..."+num3);
                break;
        }
    }
    
}
