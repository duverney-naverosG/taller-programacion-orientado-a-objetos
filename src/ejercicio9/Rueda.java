//Rueda: con métodos para inflar la rueda y desinflarla.
package ejercicio9;
//@author DUVERNEY NAVEROS COD.20201187763
public class Rueda {
    private int cantidad;
    
    public String inflar(int cantidad){
        this.cantidad+=cantidad;
        return("rueda inflada");
    } 
    public String desinfar(){
        this.cantidad=0;
        return("rueda desinflada");
    }
}
