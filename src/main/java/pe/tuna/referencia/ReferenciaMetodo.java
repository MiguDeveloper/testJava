package pe.tuna.referencia;

import java.util.ArrayList;
import java.util.List;

public class ReferenciaMetodo {
    /*
    Tipos de metodos de Referencia

    Tipo                            Syntax                      Method Reference        Lambda expresion
    ----------------------------------------------------------------------------------------------------------
    Referencia a static method      Class::staticMethod         Math::abs               n->Math.abs(n)
    ----------------------------------------------------------------------------------------------------------
    Referencia a un metodo de       instancia::metodoInstancia  s:toString              ()->"string".toString
    instancia de un objeto
    particular
    ----------------------------------------------------------------------------------------------------------
    Referencia a un metodo          Class::metodoInstancia      String::toString        s->s.toString()
    de instancia de un objeto
    arbitrario de un tipo
    particular
    ----------------------------------------------------------------------------------------------------------
    Referencia a un                 Class::new                  String::new             ()->new String
    constructor
     */

    public static void main(String[] args) {
        ITrabajo iTrabajo = new ITrabajo() {
            @Override
            public void accion() {
                User.referenciaAMetodoStatico();
            }
        };

        ITrabajo iTrabajo1 = ()->User.referenciaAMetodoStatico();

        ITrabajo iTrabajo2MR = User::referenciaAMetodoStatico;

        iTrabajo2MR.accion();

        ITrabajoString iTrabajoString = palabra -> palabra.toUpperCase();
        ITrabajoString iTrabajoStringRM = String::toUpperCase;
        System.out.println(iTrabajoString.accion("Miguel"));

        List<User> userList = new ArrayList<User>();
        userList.add(new User("Miguel 1"));
        userList.add(new User("Miguel 2"));
        userList.add(new User("Miguel 3"));

        userList.forEach(nombre -> nombre.mostrarNombre());
        userList.forEach(User::mostrarNombre);

    }
}
