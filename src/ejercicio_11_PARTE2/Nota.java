//clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define constructor, setters getters y toString
package ejercicio_11_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763
 
public class Nota {
    protected int ID;
    protected String linea_texto;
    
    public Nota(int id, String linea_texto){
        this.ID=id;
        this.linea_texto=linea_texto;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLinea_texto() {
        return linea_texto;
    }
    public void setLinea_texto(String linea_texto) {
        this.linea_texto = linea_texto;
    }
    @Override
    public String toString() {
        return "ID: " + ID + ", linea_texto: " + linea_texto;
    }
}
