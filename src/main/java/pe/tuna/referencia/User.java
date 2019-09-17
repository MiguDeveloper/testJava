package pe.tuna.referencia;

public class User {
    private  String nombre;

    public User(String nombre) {
        this.nombre = nombre;
    }

    public static void referenciaAMetodoStatico(){
        System.out.println("Probado referencia a metodo estatico");
    }

    public void referenciaAMetodoParticular(){
        System.out.println("Probando referencia a metodo de objeto particular");
    }

    public void mostrarNombre(){
        System.out.println(nombre);
    }

}
