/*Cree una clase denominada Alarma cuyos objetos activen un objeto de tipo Timbre 
cuando el valor medido por un Sensor supere un umbral preestablecido:
Implemente en Java todo el código necesario para el funcionamiento de la alarma, 
suponiendo que la alarma comprueba si debe activar o desactivar el timbre cuando se invoca el método comprobar().*/
package ejercicio1_PARTE2;
//@author DUVERNEY NAVEROS  COD.20201187763
 
public class main {
    public static void main(String[] args){
        Alarma alarma2 = new Alarma();
        alarma2.comprobar();
        alarma2.Valor_actual(60);
        alarma2.comprobar();
    }
}
