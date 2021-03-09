/*Crea una clase Nits que se usará para mantener NIT con su correspondiente digito de verificación. 
Los atributos serán el número de nit (entero largo) y el digito de verificación que le corresponde. 
La clase dispondrá de los siguientes métodos:
• Constructor predeterminado que inicialice el nº de Nit a 0 y la letra a 0 (será un NIT no válido).
• Constructor que reciba el Nit y establezca el digito de verificación que le corresponde.
• get y set para el número de Nit (que ajuste automáticamente el dígito de verificación).
• leer(): que pida el número de Nit (ajustando automáticamente el digito de verificación)
• Método que nos permita mostrar el NIT (números, un guion y el dígito de verificación; por ejemplo: 891180006-8)
 */
package ejercicio7;
//@author DUVERNEY NAVEROS COD.20201187763

public class Nits {
    private long nit;
    private int num_verificacion;
    //CONSTRUCTOR NO VALIDO
    public Nits(){
        nit=0;
        num_verificacion=0;
    }
    //CONSTRUCTOR
    public Nits(long nit){
        this.nit=nit;
        num_verificacion();
        
    }
    //METODO QUE CALCULA EL NUMERO DE VERIFICACION
    private void num_verificacion(){
        char numero_individual;
        float suma = 0;
        String numero_nit = String.valueOf(nit);//convertimos el nit en una cadena
        for(int i=0;i<=8;i++){
            /*EXPLIACACION DE LA SIGUIENTE OPERACION: 
            la candena nit devuelve un caracter; que utilizamos para poder recorer cada numero,
            ese mismo caracter se convierte otra vez en una cadena para luego convertirlo en long
            y poder operar*/
            String numero=String.valueOf(numero_individual=numero_nit.charAt(i));
            long numero_final=Long.parseLong(numero);//convertimos cada caracter en un long para poder operar
            switch(i){
                case 0:
                    suma+=(numero_final*41);
                    break;
                case 1:
                    suma+=(numero_final*37);
                    break;
                case 2:
                    suma+=(numero_final*29);
                    break;
                case 3:
                    suma+=(numero_final*23);
                    break;
                case 4:
                    suma+=(numero_final*19);
                    break;
                case 5:
                    suma+=(numero_final*17);
                    break;
                case 6:
                    suma+=(numero_final*13);
                    break;
                case 7:
                    suma+=(numero_final*7);
                    break;
                case 8:
                    suma+=(numero_final*3);
                    break;
            }
        }
        suma=suma%11;
        num_verificacion=(int)(suma);
        if(num_verificacion>=2){
            num_verificacion-=11;
            num_verificacion=Math.abs(num_verificacion);
        }
    }
    //METODOS SETTERS Y GETTERS
    public long getNit() {
        return nit;
    }
    public int getNum_verificacion(){
        return num_verificacion;
    }
    public void setNit(long nit) {//permite generar un nuevo nit con su numero de verificacion
        this.nit = nit;
        num_verificacion();
    }
    //METODO LEER
    public Nits leer(Nits nit){
        this.nit=nit.nit;
        this.num_verificacion=nit.num_verificacion;
        return nit;
    }
    @Override
    public String toString() {
        return "Nit= " + nit + "-"+ num_verificacion;
    }
}
