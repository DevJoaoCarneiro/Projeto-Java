public class Audio {
    protected float duracao;
    protected int numRepeticao;
    protected int numCurtidas;
    protected float classificacao;

    public Audio(float duracao, int numRepeticao, int numCurtidas, float classificacao) {
        this.duracao = duracao;
        this.numRepeticao = numRepeticao;
        this.numCurtidas = numCurtidas;
        this.classificacao = classificacao;
    }
}
