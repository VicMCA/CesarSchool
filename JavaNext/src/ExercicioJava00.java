public class ExercicioJava00 {
    public static void main(String[] args) throws Exception {
        long numeroFatorial = 10l;
        long resultado = 1l;

        for (long count = numeroFatorial; count > 0; count--) {
            resultado = count * resultado;
        }

        System.out.println(resultado);
    }
}