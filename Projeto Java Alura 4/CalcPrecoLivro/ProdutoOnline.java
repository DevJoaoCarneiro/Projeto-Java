public class ProdutoOnline extends EmpresaProdutos implements Calculavel {
    protected float frete;
    protected int distancia;

    public ProdutoOnline(String nome, int dataDeLancamento, float preco, float frete) {
        super(nome, dataDeLancamento, preco);
        this.frete = frete;
    }

    public void setdistancia(int distancia){
        this.distancia = distancia;
    }

    public float getfrete() {
        return frete;
    }

    public int getdistancia() {
        return distancia;
    }

    public double calcularPrecoFinal(String sexo) {
        if (sexo.equals("Homem")) {
            return preco - (preco * 0.20);
        } else {
            return preco - (preco * 0.15);
        }
    }

    public float calculaFrete() {     
        return distancia*frete;
    }

}
