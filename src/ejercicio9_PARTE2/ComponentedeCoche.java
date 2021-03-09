//clase ComponentedeCoche: con los atributos descripción, peso y coste, y un método que muestre dichos atributos
 
package ejercicio9_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class ComponentedeCoche {
    protected String descripcion;
    protected float peso;
    protected float coste;
    public ComponentedeCoche(String descripcion, float peso, float coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }
    
    @Override
    public String toString(){
        return "descripcion: "+descripcion+" peso: "+peso+" coste: "+coste;
    }
}
