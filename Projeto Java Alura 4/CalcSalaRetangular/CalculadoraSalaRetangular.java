public class CalculadoraSalaRetangular implements CalculoGeometrico {

    public void getcalcularArea(float altura, float largura) {
        float area;
        area = altura * largura;
        System.out.println("O area da sala retangular e.......:" + area);
    }

    public void getcalcularPerimetro(float altura, float largura) {
        float perimetro;
        perimetro = 2 * (altura + largura);
        System.out.println("O perimetro da sala retangular e..:" + perimetro);
    }
}
