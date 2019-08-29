package pe.tuna.lambdas;

public class Main {

    public static void main(String[] args) {
        /*
        Lambdas Java 8
        () -> "Miguel Chinchay";
        (n) -> n*n;
        (n) -> n==n;

        Ejemplo Java 7 de interface para resolver un lambda
         */
        IMiNombre iMiNombre = new IMiNombre() {
            public String getMiNombre() {
                return "Miguel Chinchay not lambda";
            }
        };
        // sin el uso de lambda
        System.out.println(iMiNombre.getMiNombre());

        // ejemplo con lambda
        IMiNombre iMiNombreLambda = () -> "Miguel Chinchay Lambda";

        System.out.println(iMiNombreLambda.getMiNombre());

        // diferente formato de las lambdas
        ISuma suma = (a, b) -> a + b;
        System.out.println(suma.sumar(3, 2));

        ISuma suma1 = (a, b) -> {
            a = b * b;
            a = a + b;
            System.out.println("mensaje dentro de funcion lambda");
            return a;
        };
        System.out.println(suma1.sumar(3, 2));

        // Ejemplo de metodo por default en interfaces
        IPorDefecto iPorDefecto = new IPorDefecto() {
            @Override
            public void montrarNombre(String nombre) {

            }
        };

        System.out.println(iPorDefecto.nombrePorDefecto("Miguel"));

    }

}
