package ejercicio7;

/**
 *
 * @author DUVER NAVEROS
 */
public class main {
    public static void main(String[] args){
        Nits nit1 = new Nits(899876892);
        System.out.println("nit1: "+nit1.toString());
        nit1.setNit(899876895);
        System.out.println("nit1: "+nit1.toString());
        Nits nit2=new Nits();
        nit2.leer(nit1);
        System.out.println("nit2: "+nit2.toString());
    }
}
