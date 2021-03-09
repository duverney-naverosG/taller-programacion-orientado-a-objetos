/*Desarrolla una clase CD con los siguientes atributos:
• canciones: un array de objetos de la clase Cancion.
• contador: la siguiente posición libre del array canciones. y los siguientes métodos:
• CD(): constructor predeterminado (creará el array canciones).
• numeroCanciones(): devuelve el valor del contador de canciones.
• dameCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
• grabaCancion(int, Cancion): cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
• agrega(Cancion): agrega al final del array la Cancion proporcionada.
• elimina(int): elimina la Cancion que se encuentra en la posición indicada.
*/
package ejercicio_13;
import java.util.ArrayList;
//@author DUVEREY NAVEROS COD.20201187763

public class CD {
    private final ArrayList<String> canciones;
    private int contador=0;
    
    public CD(){
        canciones = new ArrayList<>();
    }
    public int  numeroCanciones(){
        return canciones.size();
    }
    public void dameCancion(int posicion){
        posicion-=1;
        if(posicion>canciones.size()){
            System.out.println("no se encuentra agregada");
        }else{
            System.out.println(canciones.get(posicion));
        }
    }
    public void grabaCancion(int posicion, String cancion){
        posicion-=1;
        canciones.set(posicion, cancion);
    }
    public void agrega(String cancion){
        canciones.add(cancion);
        contador++;
    }
    public void elimina(int posicion){
        if(posicion>canciones.size()){
            System.out.println("pisicion incorrecta");
        }else{
            canciones.remove(posicion);
            contador--;
        }
    }

    @Override
    public String toString() {
        return "numero de canciones=" + contador;
    }
    
}
