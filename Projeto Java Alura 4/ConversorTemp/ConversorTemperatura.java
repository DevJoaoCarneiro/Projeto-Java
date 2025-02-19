public class ConversorTemperatura {
    public static void main(String[] args) throws Exception {
        double num,num2;
        ConversoTempPadrao conversor = new ConversoTempPadrao();
        num = conversor.celsiusparaFahrenheit(35);
        num2 = conversor.fahrenheitParaCelsius(72);

        System.out.println("Valor trocado para fahrenheit..:"+num);
        System.out.println("Valor trocado para Celsius.....:"+num2);
    }
}
