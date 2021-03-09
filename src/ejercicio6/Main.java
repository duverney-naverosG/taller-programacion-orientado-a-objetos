package ejercicio6;
/**
 * @author DUVERNEY NAVEROS COD.20201187763
 */
public class Main {
    public static void main(String[] args){
        Cafetera cafetera1 = new Cafetera();
        //VER DATOS DE LA CAFETERA 1
        System.out.println(cafetera1.toString());
        //VALOR QUE EXEDE LA CAPACIDA MAXIMA
        cafetera1.agregarCafe(2000);
        //VER DATOS DE LA CAFETERA
        System.out.println(cafetera1.toString());
        //AGREGAR 100CC DE CAFE
        cafetera1.agregarCafe(100);
        System.out.println(cafetera1.toString());
        //SERVIR TASAS
        cafetera1.servirTaza(50);
        cafetera1.servirTaza(20);
        cafetera1.servirTaza(50);
        System.out.println(cafetera1.toString());
        //AGREGAR 100CC DE CAFE
        cafetera1.agregarCafe(100);
        System.out.println(cafetera1.toString());
        //LLENA LA CAFETERA AL MAXIMO 
        cafetera1.llenarCafetera();
        System.out.println(cafetera1.toString());
        //VACIA LA CAFETERA 
        cafetera1.vaciarCafetera();
        System.out.println(cafetera1.toString());
        
    }
}
