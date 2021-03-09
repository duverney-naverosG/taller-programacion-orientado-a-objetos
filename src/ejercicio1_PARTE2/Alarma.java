package ejercicio1_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class Alarma extends Sensor implements Timbre{
    
    protected int umbral=50;
    public void comprobar(){
        if(valor_actual>umbral){
            activar();
        }else{
            desactivar();
        }
    }
    @Override
    public void activar() {
        System.out.println("alarma encendida");
    }
    @Override
    public void desactivar() {
        System.out.println("alarma apagada");
    }
}
