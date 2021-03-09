//Motor: con métodos para arrancar el motor y apagarlo.
package ejercicio9;
//@author DUVERNEY NAVEROS COD.20201187763
public class Motor {
    private int velocidad;
    
    public void arrancar(int velocidad){
        this.velocidad=velocidad;
    }
    public void apagar(){
        this.velocidad=0;
    }

    @Override
    public String toString() {
        return "Motor{" + "velocidad=" + velocidad +"MK}";
    }
    
}
