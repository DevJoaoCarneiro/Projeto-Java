public class TabuadaMultiplicacao implements Tabuada {
    public void mostrarTabuada(int num, int num2, int num3){
        int i;
        int calc;

        for(i=num2;i<=num3;i++){
            calc = num*i;
            System.out.format("%d X %d = %d\n",num, i ,calc);
        }
    }
}
