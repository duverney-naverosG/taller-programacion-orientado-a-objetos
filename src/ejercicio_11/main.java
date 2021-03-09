package ejercicio_11;
//@author DUVERNEY NAVEROS COD.20201187763

public class main {
    public static void main(String[] args){
        
        Cancion cancion1 = new Cancion();
        System.out.println(cancion1.dameTitulo());
        System.out.println(cancion1.dameAutor());
        
        Cancion cancion2 = new Cancion("here without you", "3 doors down");
        System.out.println(cancion2.dameTitulo());
        System.out.println(cancion2.dameAutor());
        
        cancion2.ponTitulo("save your tears");
        cancion2.ponAutor("the weeknd");
        System.out.println(cancion2.dameTitulo());
        System.out.println(cancion2.dameAutor());
    }
}
