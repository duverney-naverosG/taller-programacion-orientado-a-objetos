/*Desarrollar una lista de Lista ordenada por título. 
La funcionalidad de la lista será la habitual: conocer el número de libros que hay en la lista, 
insertar un nuevo libro (en la posición que le corresponda), 
eliminar el libro de una determinada posición y obtener el libro de una determinada posición. 
También incluirá un método para buscar un libro a partir de una parte de su título (sin distinguir entre mayúsculas y minúsculas); 
el método devolverá la posición en la que se encuentra el libro (–1 si no se encuentra).
 */
package ejercicio_14;
//@author DUVERNEY NAVEROS  COD.20201187763
import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    private final ArrayList<String> libros;
    
    public Lista(){
        libros=new ArrayList<>();
    }
    public int numero_libros(){
        return libros.size();
    }
    public void insertar_libro(String nombre){
        libros.add(nombre);
        Collections.sort(libros);//permite ordenar el arreglo
    }
    public void eliminar_libro(int posicion){
        posicion-=1;//se resta un 1 porque el vector empieza desde cero
        if(posicion>=libros.size()){
            System.out.println("posicion no existe");
            System.out.println("nunmero de posiciones: "+numero_libros());
        }else{
            libros.remove(posicion);
        }
    }
    public void obtener_libro(int posicion){
        posicion-=1;//se resta un 1 porque el vector empieza desde cero
        if(posicion>=libros.size()){
            System.out.println("posicion no existe");
            System.out.println("numero de posiciones: "+numero_libros());
        }else{
            System.out.println(libros.get(posicion));
        }
    }
    public int buscar_libro(String nombre){
        int posicion = 0;
        String libro_lista;
        boolean valor=false;
        for(int i=0;i<libros.size();i++){
            libro_lista=libros.get(i);//guardamos el nombre del libro como aparece en el arreglo
            String libro_lista_minuscula = libro_lista.toLowerCase();//convertimo el nombre_lista en minuscula
            String libro = nombre.toLowerCase();//convertimos el nombre a buscar a minuscula
            valor=libro_lista_minuscula.contains(libro);//se hace la busqueda gracias a contains
            if(valor==true){
                posicion=i+1;//se suma 1 porque el vector empieza desde cero
                break;
            }else{
                posicion=-1;//si no se encuentra 
            }
        }
        return posicion;
    }
}
