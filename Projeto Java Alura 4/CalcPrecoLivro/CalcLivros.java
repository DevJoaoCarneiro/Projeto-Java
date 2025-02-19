import java.util.Scanner;

public class CalcLivros {
    public static void main(String[] args) throws Exception {
        double valor;
        int distancia;
        int escolha;

        ProdutoOnline livroOnline = new ProdutoOnline("Pequeno Principe", 2022, 39.99f, 0.05f);
        ProdutoFisico livroFisico = new ProdutoFisico("Pequeno Principe", 2022, 39.99f, 1500.50f);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Produto online (1) Produto Fisico (2)");
        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a distancia em km.....");
            distancia = scanner.nextInt();

            livroOnline.setdistancia(distancia);

            valor = livroOnline.calcularPrecoFinal("Homem");

            System.out.format("O valor do produto e %.2f e com desconto fica %.2f\n", livroOnline.preco, valor);
            System.out.println("O valor do frete e ...:R$" + livroOnline.calculaFrete());
        } else {
            livroFisico.setprecoImpressao(10);
            livroFisico.exibirInformacoes();
        }
        scanner.close();
    }
}
