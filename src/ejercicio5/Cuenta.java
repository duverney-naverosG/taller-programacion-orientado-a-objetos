/*Crea una clase Cuenta (bancaria) con atributos para el número de cuenta (un entero largo), 
identificación del cliente (otro entero largo), el saldo actual y el interés anual que se aplica a la cuenta (porcentaje). 
Define en la clase los siguientes métodos:
• Constructor por defecto y constructor con DNI, saldo e interés
• getters, setters. Para el número de cuenta no habrá setter.
• actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario 
(interés anual dividido entre 365 aplicado al saldo actual).
• ingresar(double): permitirá ingresar una cantidad en la cuenta.
• retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
• Método que nos permita mostrar todos los datos de la cuenta.
El número de cuenta se asignará de forma correlativa a partir de 100001, asignando el siguiente número al último asignado
 */
package ejercicio5;
//@author DUVERNEY NAVEROS COD.20201187763
public class Cuenta {
    private static long num_cuenta=100000;
    private long DNI;
    private float saldo;
    private float interes;
    //CONSTRUCTOR POR DEFECTO
    public Cuenta() {
        num_cuenta();
        this.DNI = 1007682071;
        this.saldo = 1000;
        this.interes = 5;
    }
    //CONSTRUCTOR
    public Cuenta(long DNI, float saldo, int interes) {
        num_cuenta();
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }
    //ASIGNAR NUMERO DE CUENTA A CADA CUENTA
    private void num_cuenta(){
        num_cuenta=num_cuenta+1;
    }
    //METODOS GETTERS
    public long getNum_cuenta() {
        return num_cuenta;
    }
    public long getDNI() {
        return DNI;
    }
    public String getInteres() {
        return interes+"%";
    }
    //METODO SETTERS
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    public void actualizarSaldo(){
        float interes=(this.interes/365);
        saldo=saldo-interes;
        System.out.println("saldo actual: "+saldo);
    }
    
    public void ingresar(float saldo_ingresar){
       saldo=saldo+saldo_ingresar;
        System.out.println("ingreso exitoso");
        actualizarSaldo();
    }
    
    public void retirar (float valor_retirar){
        if(saldo==0){
            System.out.println("no posee con el fondo sufiente");
        }else if(valor_retirar>saldo){
            System.out.println("no posee con el dondo sufiente");
            actualizarSaldo();
        }else{
            saldo=saldo-valor_retirar;
            System.out.println("retiro exitoso");
            actualizarSaldo();
        }
    }
    @Override
    public String toString() {
        return "num_cuenta=" + num_cuenta + ", DNI=" + DNI + ", saldo=" + saldo + ", interes=" + interes +"%}";
    }
    
    
}
