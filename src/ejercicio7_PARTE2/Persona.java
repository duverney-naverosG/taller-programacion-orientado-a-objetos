/*Persona: Clase ya creada (con nombre, apellidos y número de identificación, ver ejercicio anterior) 
a la que añadiremos el atributo dirección y sus métodos get y set.*/
package ejercicio7_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763
 
public class Persona implements Humano {
    protected String nombre;
    protected String apellido;
    protected long ID;
    protected String direccion;
    
    public Persona(String nombre, String apellido, long id, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.ID=id;
        this.direccion=direccion;
    }

    @Override
    public void identificate() {
        System.out.println("persona");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
