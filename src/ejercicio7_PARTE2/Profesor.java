/*Profesor: Subclase de Persona.
• Atributos: despacho
• Constructores: predeterminado y constructor parametrizado que admita el despacho.
• Métodos get, set y toString()*/
package ejercicio7_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class Profesor extends Persona{
    private String despacho;
    public Profesor() {
        super("fernado", "rojas", 2658735, "calle 25 a #5-240");
        despacho="facultad de educacion-segundo piso";
    }
    public Profesor(String nombre, String apellido, long id, String direccion, String despacho) {
        super(nombre, apellido, id, direccion);
        this.despacho = despacho;
    }
    @Override
    public void identificate() {
        System.out.println("PROFESOR");
    }
    public String getDespacho() {
        return despacho;
    }
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    @Override
    public String toString() {
        return "nombre: "+nombre+" "+apellido+" ID: "+ID+" direccion: "+direccion+" despacho: "+despacho;
    }
    
}
