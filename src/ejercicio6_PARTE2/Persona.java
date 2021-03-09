//Persona (que tiene nombre y apellidos, y Número de documento de id)
package ejercicio6_PARTE2;
//@author DUVERNEY NAVEROS VOD..20201187763

public class Persona {
    private String nombre;
    private String apellidos;
    private long id;
    
    Persona(String nombre, String apellido, long id){
        this.nombre=nombre;
        this.apellidos=apellido;
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public  String toString() {
        return "TITULAR" + " nombre:" + nombre + ", apellidos:" + apellidos + ", ID=" + id;
    }
    
}
