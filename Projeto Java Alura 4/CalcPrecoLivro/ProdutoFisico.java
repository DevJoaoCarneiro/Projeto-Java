public class ProdutoFisico extends EmpresaProdutos{
    protected float gastoFuncionarios;
    protected float precoImpressao;

    public ProdutoFisico(String nome, int dataDeLancamento, float preco, float gastoFuncionarios) {
        super(nome, dataDeLancamento, preco);
        this.gastoFuncionarios = 1500.50f;
    }

    public void setprecoImpressao(float precoImpressao){
        this.precoImpressao= precoImpressao;
    }

    public float getprecoImpressao(){
        return precoImpressao;
    }

    public float getgastoFuncionarios(){
        return gastoFuncionarios;
    }

    public void exibirInformacoes(){
        
        System.out.println("Nome Produto....:"+super.nome);
        System.out.println("Data lancamento.:"+super.dataDeLancamento);
        System.out.println("Preco do produto:"+super.preco);
           
    }

}
