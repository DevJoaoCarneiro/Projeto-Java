public class Musicas extends Audio implements Reproducao {
    String nomeBanda;
    String produtor;
    String lingua;

    public Musicas(float duracao, int numRepeticao, int numCurtidas, float classificacao, String nomeBanda,
            String produtor, String lingua) {
        super(duracao, numRepeticao, numCurtidas, classificacao);
        this.nomeBanda = nomeBanda;
        this.produtor = produtor;
        this.lingua = lingua;

    }

    public String getnomeBanda() {
        return nomeBanda;
    }

    public String getprodutor() {
        return produtor;
    }

    public void curtirPrograma(int classificacao) {
        System.out.println("Classificacao do publico...." + classificacao);
        super.numCurtidas++;
        System.out.println("Obrigado pelo feedback");
    }

    public void reproduzir() {
        System.out.println("Tocar musica");
        System.out.println("Nome......." + nomeBanda);
        System.out.println("Produtor..." + produtor);
        System.out.println("Duracao...." + super.duracao);
        super.numRepeticao++;
    }


    @Override
    public String toString() {       
        return "Nome da banda... "+this.nomeBanda+ " ("+this.classificacao+")" ;
    }
}
