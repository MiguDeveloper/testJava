package pe.tuna.lambdas;

/* Interfaz funcional: ya que solo tiene un método abstracto
 * para que el squad lo reconozca como intefaz funcional podemos usar la
 * etiqueta @FunctionalInterface
 */

@FunctionalInterface
public interface IMiNombre {
    public String getMiNombre();
}
