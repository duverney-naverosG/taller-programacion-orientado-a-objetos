/*clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. 
Define constructor, setters getters y toString*/
package ejercicio_11_PARTE2;
//@author DUVERNEY NAVEROS CO.20201187763

public class NotaAlarma extends Nota{
    private String hora;
    public NotaAlarma(int id, String linea_texto, String hora) {
        super(id, linea_texto);
        this.hora=hora;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    @Override
    public String toString() {
        return "ID: " + ID + ", linea_texto: " +linea_texto+" hora: "+hora;
    }   
}
