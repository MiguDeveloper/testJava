package pe.tuna.lambdas;

public interface IPorDefecto {
    public void montrarNombre(String nombre);

    /*
     * El tipo por defult nos permite poder implementar metodos que no son necesarios que cada clase
     * que implemente la interface redefina su implementacion sino que es el mismo resultado para todos.
     */
    default String nombrePorDefecto(String nombre){
        return nombre + " default";
    }
}
