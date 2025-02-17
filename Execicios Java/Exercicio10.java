/*Autor.....Joao Victor
  Data......17/02/25
  Objetivo..Exercicio 10*/
package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    /*Pega uma string e retorna o tamanho*/
    public static int retornaNome(String nome) {
        return nome.length();
    }

    /*Verificar 2 Strings se são iguais*/
    public static boolean validarNome(String nome, String nome2) {
        return nome.equalsIgnoreCase(nome2);
    }

    //Validar se é vogal
    public static boolean validarVogal(String nome) {
        nome.charAt(0);
        nome.toLowerCase();

        switch (nome) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return true;
            default:
                return false;
        }
    }

    //Funcao retorna somente a primeira letra
    public static String retornaLetra(String nome) {
        return nome.substring(0,1);
    }

    //Verifica se a funcao comeca com A
    public static boolean verificaLetra(String nome) {
        nome = nome.toUpperCase();
        return nome.startsWith("A");
    }

    //Verifica se a string tem apenas letras
    public static boolean testeLetra(String nome) {
        int i;

        for (i = 0; i < nome.length(); i++) {
            if (!Character.isLetter(nome.charAt(i))) {
                return false;
            } 

        }
        return true;
    }

    //Converter letra a por @
    public static String converteLetras(String nome) {
        nome = nome.toLowerCase();
        return nome.replace("a", "@");
    }

    /*Função que receba uma string e verifique se contem a
    palavra Java*/
    public static boolean verificaPalavra(String nome) {
        String nomeJava = "java";
        nome = nome.toLowerCase();
        return nome.contains(nomeJava);
    }

    //Converte texto para letras maisculas
    public static String converteMaiscula(String nome) {
        return nome.toUpperCase();

    }

    //Verifica se a ultima letra é Z
    public static boolean testeLetraZ(String nome) {
        int n;
        nome = nome.toLowerCase();
        n=nome.length();
        return nome.substring(n-1).equals("z");    
        
    }

    public static void layout() {
        System.out.println("MENU DE OPCOES");
        System.out.println("1-Verificar tamanho String.................");
        System.out.println("2-Verificar duas String sao iguais.........");
        System.out.println("3-Digitar uma letra e consultar se e vogal.");
        System.out.println("4-Retornar a primeira letra................");
        System.out.println("5-Verificar se comeca com letra A..........");
        System.out.println("6-Verificar se contem apenas letras........");
        System.out.println("7-Substituir a por @ ......................");
        System.out.println("8-Verificar se esta escrito JAVA ..........");      
        System.out.println("9-Converter para letras maisculas..........");
        System.out.println("10-Verificar se a ultima letra e Z.........");
        System.out.format("Digite sua escolha.....");
    }

    public static void main(String[] args) {
        String nome;
        String nome2;
        int escolha;
        int reiniciar;

        do {
            Scanner scanner = new Scanner(System.in);
            layout();
            do {
                escolha = scanner.nextInt();
                scanner.nextLine();
                if (escolha > 10 || escolha < 1) {
                    System.out.println("Digite uma opcao valida");
                }
            } while (escolha > 10 || escolha < 1);

            System.out.format("Digite uma palavra.....");
            nome = scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println(retornaNome(nome));
                    break;
                case 2:
                    System.out.format("Digite outra palavra.....");
                    nome2 = scanner.nextLine();
                    System.out.println(validarNome(nome, nome2));
                    break;
                case 3:
                    System.out.println(validarVogal(nome));
                    break;
                case 4:
                    System.out.println(retornaLetra(nome));
                    break;
                case 5:
                    System.out.println(verificaLetra(nome));
                    break;
                case 6:
                    System.out.println(testeLetra(nome));
                    break;
                case 7:
                    System.out.println(converteLetras(nome));
                    break;
                case 8:
                    System.out.println(verificaPalavra(nome));
                    break;
                case 9:
                    System.out.println(converteMaiscula(nome));
                    break;
                case 10:
                    System.out.println(testeLetraZ(nome));
                    break;
            }
            System.out.println("\n\nReiniciar o programa (1-Sim 2-Nao)");
            reiniciar = scanner.nextInt();
        }while(reiniciar==1);
    }

}
