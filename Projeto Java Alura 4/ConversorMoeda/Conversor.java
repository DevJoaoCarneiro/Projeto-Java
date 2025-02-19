public class Conversor {
    public static void main(String[] args) throws Exception {
        ConversorMoeda conversor = new ConversorMoeda();

        conversor.converterDolarParaReal(55, 5.24f);
        conversor.converterDolarParaEuro(75, 0.96f);
        conversor.converterDolarParaLibra(120, 0.79f);
    }
}
