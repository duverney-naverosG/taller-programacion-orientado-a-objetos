package ejercicio5;
/**
 * @author DUVERNEY NAVEROS COD.20201187763
 */
public class main {
    public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta(26460171, 30000, 20);
        System.out.println(cuenta1.toString());
        cuenta1.actualizarSaldo();
        System.out.println(cuenta1.toString());
        
        Cuenta cuenta2 = new Cuenta(1007682071, 20000, 10);
        System.out.println(cuenta2.toString());
        cuenta2.ingresar(20000);
        cuenta2.toString();
        cuenta2.retirar(20000);
        cuenta2.toString();
        System.out.println(cuenta2.toString());
    }
}
