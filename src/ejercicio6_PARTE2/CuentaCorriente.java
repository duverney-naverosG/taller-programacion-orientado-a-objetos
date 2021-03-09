//CuentaCorriente: Cuenta normal con un interés fijo del 1.5%. Incluir constructor parametrizado y método toString().
package ejercicio6_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763
public class CuentaCorriente extends Cuenta{
    private final float interes=1.5f;
    public CuentaCorriente(Persona cliente, long num_cuenta, double saldo) {
        super(cliente, num_cuenta, saldo);
    }
    @Override
    public void retirar(double valor) {
        if(valor>0&&valor<saldo){
            saldo-=valor;
            System.out.println("retiro exitoso, saldo actual: "+saldo);
        }else{
            System.out.println("no cuenta con el fondo sufiente");
        }
    }
    @Override
    public void actualizar_saldo(){
        double intere=(saldo*interes)/100;
        saldo=saldo-intere;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente"+" numero de cuenta: "+numero_cuenta+" saldo: "+saldo+" intereses: "+interes+"%";
    }
    
}
