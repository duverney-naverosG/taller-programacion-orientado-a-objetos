/*clase PuertaCoche, con el atributo boolean estaBloqueada, y que extienda la clase ComponentedeCoche 
e implemente las interfaces Alarma y Puertabloqueable*/
package ejercicio9_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763
 
public class PuertaCoche extends ComponentedeCoche implements Alarma, PuertaBloqueable {
    private boolean estaBloqueada;
    private boolean Abierta;
    private boolean alarmaActivada;

    public PuertaCoche(String descripcion, float peso, float coste) {
        super(descripcion, peso, coste);
    }

    @Override
    public void activarAlarma(){
        System.out.println("alarma activada");
        alarmaActivada=true;
    }
    @Override
    public void desactivarAlarma() {
        System.out.println("alarma desactivada");
        alarmaActivada=false;
    }
    @Override
    public void bloquea() {
        estaBloqueada=true;
    }
    @Override
    public void desbloquea() {
        estaBloqueada=false;
    }
    @Override
    public void abrir() {
        System.out.println("puerta abierta");
        Abierta=true;
        
    }
    @Override
    public void cerrar() {
        System.out.println("puerta cerrada");
        Abierta=false;
    }

    public String estado_carro() {
        return "puerta bloqueada= " + estaBloqueada + ",puerta Abierta= " + Abierta + ", alarma Activada= " + alarmaActivada;
    }

    @Override
    public String toString() {
        return "Descripcion: "+descripcion+" peso: "+peso+" coste: "+coste;
    }
    
}
