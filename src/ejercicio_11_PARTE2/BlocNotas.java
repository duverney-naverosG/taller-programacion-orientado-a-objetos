/*clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, 
listar todas las notas, eliminar una nota mediante su posición en el bloc de notas o 
saber cuántas notas contiene el bloc de notas.*/
package ejercicio_11_PARTE2;
import java.util.Vector;
//@author DUVERNEY NAVEROS COD.20201187763

public class BlocNotas {
    private Vector notas=new Vector(20, 5);
    public void introducir_notas(Nota nota){
        notas.add(nota);
    }
    public void listar_notas(){
        for(int i=0; i<notas.size();i++){
            System.out.println(notas.get(i));
        }
    }
    public void eliminar_nota(int posicion){
        posicion-=1;
        notas.remove(posicion);
    }
    public String numero_notas(){
        return "numero de notas: "+notas.size();
    }
}
