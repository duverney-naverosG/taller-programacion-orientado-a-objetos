//Ventana: con métodos para abrirla y cerrarla
package ejercicio9;
//@author DUVERNEY NAVEROS COD.20201187763
public class Ventana {
    public boolean accion;
    
    public void abrir_ventana(){
        accion=true;
    }
    public void cerrar_ventana(){
        accion=false;
    }
    @Override
    public String toString() {
        return "accion: "+accion;
    }
}
