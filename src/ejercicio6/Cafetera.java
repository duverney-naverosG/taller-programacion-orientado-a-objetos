/*Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) 
y _cantidadActual (la cantidad actual de café que hay en la cafetera). Implementa, al menos, los siguientes métodos:

• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. 
Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• getters, setters.
• llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
• servirTaza(int): simula la acción de servir una taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
• vaciarCafetera(): pone la cantidad de café actual en cero.
• agregarCafe(int): añade a la cafetera la cantidad de café indicada.
 */
package ejercicio6;
// @author DUVERNEY NAVEROS COD.20201187763
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    //CONSTRUCTOR PRETERMINADO
    public Cafetera(){
        capacidadMaxima=1000;
        cantidadActual=0;
    }
    //CONSTRUCTOR CON LA CAPACIDAD MAXIMA
    public Cafetera(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=capacidadMaxima;
    }
    //CONSTRUCTOR CON LA CAPACIDAD MAXIMA Y CANTIDAD ACTUAL
    public Cafetera(int capacidadMaxima, int capacidadActual){
        this.capacidadMaxima=capacidadMaxima;
        if(capacidadActual>capacidadMaxima){
          this.cantidadActual=capacidadMaxima;  
        }else{
            this.cantidadActual=capacidadActual;
        }
    }
    //METODOS SETTERS
    public void setCantidadActual(int capacidadActual) {
        this.cantidadActual = capacidadActual;
    }
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    //METODOS GETTERS
    public int getCantidadActual() {
        return cantidadActual;
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    //METODOS DE LA CLASE
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
        System.out.println("cafetera llenada");
    }
    public void servirTaza(int cantidad){
        if(cantidadActual==0){
            System.out.println("disculpa no me queda cafe en la cafetera");
        }else if(cantidadActual<cantidad){
            System.out.println("disculpa, no me queda sufiente cafe (taza cervida, lo que quedaba "+cantidadActual+"cc)");
            cantidadActual=0;
        }else{
            System.out.println("taza cervida");
            cantidadActual-=cantidad;
        }
    }
    public void vaciarCafetera(){
        cantidadActual=0;
        System.out.println("cafetera vaciada");
    }
    public void agregarCafe(int cantidad){
        if(cantidad+cantidadActual>capacidadMaxima){
            System.out.println("el cafe agregado excede la capacidad de la cafetera");
            System.out.println("capacidad de la cafetera: "+capacidadMaxima);
        }else{
            cantidadActual+=cantidad;
            System.out.println("cafe agregado ");
        }
    }
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
}
