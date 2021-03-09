/*Define una clase abstracta Cuenta con los siguientes atributos:
• numerocuenta : entero largo
• saldo : double
• cliente : atributo de la clase Persona (que tiene nombre y apellidos, y Número de documento de id)
y con los siguientes métodos:
• Constructor parametrizado que recibe un cliente y un número de cuenta
• Setters y getters para los tres atributos
• ingresar(double): permitirá ingresar una cantidad en la cuenta.
• abstract retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo). 
No se implementa, depende del tipo de cuenta
• actualizarSaldo(): actualizará el saldo de la cuenta, pero cada cuenta lo hace de una forma diferente
 */
package ejercicio6_PARTE2;
//@author DUVERNEY NAVEROS  COD.20201187763

public abstract class Cuenta{
    protected long numero_cuenta;
    protected double saldo;
    public Cuenta(Persona cliente, long num_cuenta, double saldo) {
        this.numero_cuenta=num_cuenta;
        this.saldo=saldo;
    }
    public void setNombre(long num_cuenta){
        this.numero_cuenta=num_cuenta;
    }
    public long getNum_cuenta(){
        return numero_cuenta;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void ingresar(double saldo){
        this.saldo+=saldo;
    }
    public abstract void retirar(double valor);
    
    public void actualizar_saldo(){
    }
}
