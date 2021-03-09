//Puerta: con una ventana y métodos para abrir la puerta y cerrar la puerta.
package ejercicio9;
//@author DUVERNEY NAVEROS COD.20201187763
public class Puerta {
    private final int ventana=1;
    private boolean accion;
    
    public void abrir_puerta(){
        accion=true;
    }
    public void cerrar_puerta(){
        accion=false;
    }

    @Override
    public String toString() {
        return "accion: "+accion;
    }
}
