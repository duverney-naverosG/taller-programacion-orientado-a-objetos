package ejercicio2;
//@author DUVERNEY NAVEROS COD:20201187763
public class main {
    public static void main(String[] args){
        Racional fraccion1 = new Racional(10, 2);
        Racional fraccion2 = new Racional(10, 4);
        System.out.println(fraccion1.toString());
        System.out.println(fraccion2.toString());
        //SUMA
        Racional suma=fraccion1.suma(fraccion2);
        //RESTA
        Racional resta=fraccion1.resta(fraccion2);
        //MULTIPLICACION
        Racional multiplicacion=fraccion1.multiplicacion(fraccion2);
        //DIVISION
        Racional division=fraccion1.division(fraccion2);
        //MOSTRAR LAS OPERACIONES
        Racional mostrar_operaciones = new Racional();
        String mostrar_valores = mostrar_operaciones.printl(suma, resta, multiplicacion, division);
        System.out.println(mostrar_valores);
        //METODO COMPARACION
        boolean comparacion = Racional.comparacion(fraccion1, fraccion2);
        System.out.println("la compraciones de las fraccion es: "+comparacion);
        //METODO LEER
        Racional otra_fraccion=Racional.leer(4, 2);
        //METODO COPIAR
        Racional fraccion_copiada=Racional.copiar(otra_fraccion);
        System.out.println("fraccion copiada "+fraccion_copiada);
    }
}
