public class Podcast extends Audio implements Reproducao {
    private String assuntoPrograma;
    private String seguimento;

    public Podcast(float duracao, int numRepeticao, int numCurtidas, float classificacao, String assuntoPrograma,
            String seguimento) {
        super(duracao, numRepeticao, numCurtidas, classificacao);
        this.assuntoPrograma = assuntoPrograma;
        this.seguimento = seguimento;

    }

    public String getAssuntoPrograma() {
        return assuntoPrograma;
    }

    public String getSeguimento() {
        return seguimento;
    }

    public void curtirPrograma(int classificacao) {
        System.out.println("Classificacao do publico...." + classificacao);
        super.numCurtidas++;
        System.out.println("Obrigado pelo feedback");
    }

    public void reproduzir() {
        System.out.println("Tocar podcast");
        System.out.println("Nome......." + assuntoPrograma);
        System.out.println("Produtor..." + seguimento);
        System.out.println("Duracao...." + super.duracao);
        super.numRepeticao++;
    }

    @Override
    public String toString() {

        return "Tema....." + this.assuntoPrograma + " (" + this.classificacao + ")";
    }
}
