package br.com.alura.exercicio;
public class Serie extends Filme {
    private int numEpisodio=45;

    public int getnumEpisodio(){
        return numEpisodio;
    }

    public void exibeMedia(){
        super.exibeMedia();
        System.out.println("Nome diretor.........."+numEpisodio);

    }
}