package br.com.alura.exercicio;

public class Filme extends Titulo {
    private String nomeDiretor;
    private boolean temSequencia;

    public void setnomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public void temSequencia(boolean temSequencia) {
        this.temSequencia = temSequencia;
    }

    public String getnomeDiretor() {
        return nomeDiretor;
    }

    public boolean temSequencia() {
        return temSequencia;
    }

    public void exibeMedia(){
        super.exibeMedia();
        System.out.println("Nome diretor.........."+nomeDiretor);
        System.out.println("Tem sequencia?........"+temSequencia);

    }

}
