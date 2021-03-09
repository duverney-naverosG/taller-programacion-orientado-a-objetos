/*CuentaAhorro: Esta cuenta tiene como atributos el interés variable a lo largo del año y un saldo mínimo necesario. 
Al retirar dinero hay que tener en cuenta que no se sobrepase el saldo mínimo. Incluir constructor parametrizado, 
método toString() y método para cambiar el interés
 */
package ejercicio6_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class CuentaAhorro extends Cuenta{
    private float interes;
    private final float saldo_minimo;
    public CuentaAhorro(Persona cliente, long num_cuenta, double saldo, float intereses, float saldo_minimo) {
        super(cliente, num_cuenta, saldo);
        this.interes=intereses;
        this.saldo_minimo=saldo_minimo;
    }
    @Override
    public void actualizar_saldo(){
        double intereses=(saldo*interes)/100;
        saldo=saldo-intereses;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }
    @Override
    public void retirar(double valor) {
        if(saldo>0&&valor<saldo_minimo){
            saldo-=valor;
            System.out.println("retiro exitoso, saldo actual: "+saldo);
        }else if(saldo<=0){
            System.out.println("no cuenta con el fondo sufiente");
        }else{
            System.out.println("sobrepasa el saldo minimo");
        }
    }
    @Override
    public String toString() {
        return "Cuenta ahorro "+"numero de cuenta: "+numero_cuenta+" saldo: "+saldo+" intereses: "+interes+"%";
    }
    
}
