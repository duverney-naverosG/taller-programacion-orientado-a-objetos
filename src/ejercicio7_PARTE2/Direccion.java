/*Se trata de crear una pequeña base de datos de personas de una universidad. 
De momento definiremos y probaremos las siguientes clases:
a. Direccion:
• atributos: calle, ciudad, código postal, pais
• Constructores predeterminado y parametrizado
 */
package ejercicio7_PARTE2;
// @author DUVERNEY NAVEROS COD.20201187763
 
public class Direccion {
    private String calle;
    private String ciudad;
    private int codigo_postal;
    private String pais;
    public Direccion(){
        calle="carrera 5 #23-40";
        ciudad="neiva";
        codigo_postal=410001;
        pais="Colombia";
    }
    public Direccion(String calle, String ciudad, int codigo_postal, String pais){
        this.calle=calle;
        this.ciudad=ciudad;
        this.codigo_postal=codigo_postal;
        this.pais=pais;
    }
}
