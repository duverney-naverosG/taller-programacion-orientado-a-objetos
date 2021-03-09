/*Estudiante: Subclase de Persona.
• Atributos: ID de estudiante
• Constructores: predeterminado y constructor parametrizado que admita el ID.
• Métodos get, set y toString()*/
package ejercicio7_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763
 
public class Estudiante extends Persona{
    private long ID_estudiante;
    public Estudiante() {
        super("duverney", "naveros", 1007682071, "carrera 33 #30-36");
        ID_estudiante=1007682071;
    }
    public Estudiante(String nombre, String apellido, long id, String direccion, long ID_estudiante) {
        super(nombre, apellido, id, direccion);
        this.ID_estudiante = ID_estudiante;
    }    
    @Override
    public void identificate() {
        System.out.println("ESTUDIANTE");
    }
    public long getID_estudiante() {
        return ID_estudiante;
    }
    public void setID_estudiante(long ID_estudiante) {
        this.ID_estudiante = ID_estudiante;
    }
    
    @Override
    public String toString() {
        return "nombre: "+nombre+" "+apellido+" ID: "+ID+" direccion: "+direccion+" ID estudiante: "+ID_estudiante;
    }
        
}
