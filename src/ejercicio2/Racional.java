/*
Crea una clase Racional que permita trabajar con números racionales (fracciones). 
Incluye los siguientes métodos: constructores (por defecto y parametrizado), 
getters, setters, leer(), suma, resta, multiplicación, división, comparaciones, copia() y print().
 */
package ejercicio2;
//@author DUVERNEY NAVEROS   COD: 20201187763
public class Racional {
    private float numerador;
    private float denominador;
    
    //CONSTRUCTOR POR DEFECTO 
    Racional(){
        this.numerador=10;
        this.denominador=2;
    }
    //CONSTRUCTOR PARAMETRIZADO
    Racional(float numerador, float denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    //METODOS GETTERS
    public float getnumerador() {
        return numerador;
    }
    public float getDenominador() {
        return denominador;
    }
    //METODOS SETTERS 
    public void setnumerador(float numerador) {
        this.numerador = numerador;
    }
    public void setDenominador(float denominador) {
        this.denominador = denominador;
    }
    //METODO LEER
    public static Racional leer(float numerador, float denominador){
        Racional racional = new Racional();
        racional.numerador=numerador;
        racional.denominador=denominador;
        return racional;
    }
    //METODO COPIAR
    public static Racional copiar(Racional un_racional){
        Racional racional = new Racional();
        racional.numerador=un_racional.numerador;
        racional.denominador=un_racional.denominador;
        return racional;
    }
    //METODO COMPARACION
    public static boolean comparacion(Racional fraccion1, Racional fraccion2){
        boolean respuesta = false;
        if(fraccion1.getnumerador()==fraccion2.getnumerador()&&(fraccion1.getDenominador()==fraccion2.getDenominador())){
            respuesta=true;
        }
        return respuesta;
    }
    //OPERACIONES
    public Racional suma(Racional sum){
        Racional suma = new Racional();
        if(this.denominador!=sum.denominador){
            suma.numerador=(this.numerador*sum.denominador)+(this.denominador*sum.numerador);
            suma.denominador=this.denominador*sum.denominador;
        }else{
            suma.numerador=this.numerador+sum.numerador;
            suma.denominador=sum.denominador;
        }
        return suma;
    }
    public Racional resta(Racional rest){
        Racional resta = new Racional();
        if(this.denominador!=rest.denominador){
            resta.numerador=(this.numerador*rest.denominador)-(this.denominador*rest.numerador);
            resta.denominador=this.denominador*rest.denominador;
        }else{
            resta.numerador=this.numerador-rest.numerador;
            resta.denominador=rest.denominador;
        }
        return resta;
    }
    public Racional multiplicacion(Racional mult){
        Racional multiplicacion = new Racional();
        multiplicacion.numerador=this.numerador*mult.numerador;
        multiplicacion.denominador=this.denominador*mult.denominador;
        return multiplicacion;
    }
    public Racional division(Racional div){
        Racional division = new Racional();
        division.numerador=this.numerador*div.denominador;
        division.denominador=this.denominador*div.numerador;
        return division;
    }
    @Override
    public String toString() {
        return "Racional{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }
    //METODO PRINTL
    public String printl(Racional suma, Racional resta, Racional multiplicacion, Racional division){
        return "la suma es: "+suma+"\nla resta es: "+resta+"\nla multiplicacion es: "+multiplicacion+"\nla division es: "+division;
    }
}
