public class ConversoTempPadrao implements ConversorTemp {
    public double celsiusparaFahrenheit(double num) {

        return (num * 9 / 5) + 32;

    }

    public double fahrenheitParaCelsius(double num) {
        return (num - 32) * 5 / 9;
    }
}
