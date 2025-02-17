package br.com.alura.exercicio;

public class Exercicio01 {
    public static void main(String[] args) {
        Serie serie = new Serie();
        Filme filme = new Filme();
        

        serie.setnome("Ruptura");
        serie.setdataDeLancamento(2024);
        serie.setnota(10);
        

        serie.exibeMedia();
        

        filme.setnome("titanic");
        filme.setdataDeLancamento(2021);
        filme.setnota(8);
        filme.setnomeDiretor("Ben Stilon");
        filme.temSequencia(true);

        filme.exibeMedia();



    }
    
}
