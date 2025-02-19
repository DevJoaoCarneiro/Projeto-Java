import java.util.Scanner;

public class TabuadaAlura {

    private static int lerNumerosPositivos(Scanner scanner, String mensagem) {
        int numero = 0;
        do {

            System.out.println(mensagem);
            // Repete se a entrada do numero for != inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("Valor inválido! Insira um número inteiro positivo.");
                System.out.println(mensagem);
                scanner.nextLine();
            }
            // scanner.nextLine(); Para limpar o buffer
            numero = scanner.nextInt();
            scanner.nextLine();
            if (numero < 0) {
                System.out.println("Insira um numero valido");
            }
        } while (numero < 0);

        return numero;
    }

    public static void main(String[] args) throws Exception {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        Scanner scanner = new Scanner(System.in);

        int num, num2, num3;

        num = lerNumerosPositivos(scanner, "Insira um numero para gerar tabuada...:");
        num2 = lerNumerosPositivos(scanner, "Começando em...:");
        num3 = lerNumerosPositivos(scanner, "Terminando em..:");

        tabuada.mostrarTabuada(num, num2, num3);

        scanner.close();
    }
}
