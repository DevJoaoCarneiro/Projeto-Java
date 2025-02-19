public class ConversorMoeda implements ConversaoFinanceira {

    public void converterDolarParaReal(double quantidaDolar, double cotacaoDolar){
        double conversao;
        conversao = quantidaDolar * cotacaoDolar;
        System.out.format("Dolar..:%.2f\nReal...:%.2f\n\n", quantidaDolar, conversao);
    }

    public void converterDolarParaEuro(double quantidaDolar, double cotacaoDolar){
        double conversao;
        conversao = quantidaDolar * cotacaoDolar;
        System.out.format("Dolar..:%.2f\nEuro...:%.2f\n\n", quantidaDolar, conversao);
    }

    public void converterDolarParaLibra(double quantidaDolar, double cotacaoDolar){
        double conversao;
        conversao = quantidaDolar * cotacaoDolar;
        System.out.format("Dolar..:%.2f\nLibra..:%.2f\n\n", quantidaDolar, conversao);
    }
}
