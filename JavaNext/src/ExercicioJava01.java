public class ExercicioJava01 {
    public static void main(String[] args) throws Exception {
        long numeroFibbonacci = 10l;
        long resultado = 0l;
        long tempUm = 1l;
        long tempDois = 0l;

        for (long count = 0; count < numeroFibbonacci; count++) {
            resultado = tempUm + tempDois;
            tempDois = tempUm;
            tempUm = resultado;            
            System.out.println(resultado);
        }
    }
}