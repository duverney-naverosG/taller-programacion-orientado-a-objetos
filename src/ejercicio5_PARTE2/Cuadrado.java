package ejercicio5_PARTE2;

/**
 *
 * @author DUVER NAVEROS
 */
public class Cuadrado extends Figura{
    private float lado;
    public Cuadrado(float lado){
        this.lado=lado;
    }
    @Override
    public double area(){
        area=lado*lado;
        return area;
    }
}
