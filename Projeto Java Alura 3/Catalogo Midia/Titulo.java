package br.com.alura.exercicio;


public class Titulo {
    protected String nome;
    protected int dataDeLancamento;
    protected int nota;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setdataDeLancamento(int dataDeLancamento){
        this.dataDeLancamento= dataDeLancamento;
    }

    public void setnota(int nota){
        this.nota= nota;
    }

    public String getnome(){
        return nome;
    }

    public int getdataDeLancamento(){
        return dataDeLancamento;
    }

    public int getnota(){
        return nota;
    }

    public void exibeMedia(){
        System.out.println("Nome.................."+nome);
        System.out.println("Data de lançamento...."+dataDeLancamento);
        System.out.println("Nota critica.........."+nota);
    }
    
}
