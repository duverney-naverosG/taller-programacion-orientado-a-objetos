package ejercicio_14;
//author DUVERNEY NAVEROS COD.20201187763

public class main {
    public static void main(String[] args){
        Lista lista_libros=new Lista();
        lista_libros.insertar_libro("cien años de soledad-Gabriel G. Marquez");
        lista_libros.insertar_libro("el sueño de una noche de verano-William Shakespeare");
        lista_libros.insertar_libro("solo quedo nuestra historia-adam silvera");
        lista_libros.insertar_libro("seis de cuervos-Leigh Bardugo");
        System.out.println("numero de libros: "+lista_libros.numero_libros());
        System.out.println(lista_libros.buscar_libro("el sueño de una noche de verano-William Shakespeare"));
        System.out.println(lista_libros.buscar_libro("el sueño de una noche de verano"));
        System.out.println(lista_libros.buscar_libro("El SuEñO De Una NoChE de VerAno"));
        lista_libros.obtener_libro(2);
        lista_libros.eliminar_libro(2);
        lista_libros.obtener_libro(2); 
    } 
}
