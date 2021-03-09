package ejercicio6_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona("duverney","naveros gonzalez", 1007682071);
        System.out.println(persona1.toString());
        CuentaCorriente cuenta_p1 = new CuentaCorriente(persona1, 1567187763, 200000);
        CuentaAhorro cuenta_p2= new CuentaAhorro(persona1, 1123189976, 500000, 15, 50000);
        //se actualiza el saldo de las cuentas con el interes de cada cuenta 
        cuenta_p1.actualizar_saldo();
        cuenta_p2.actualizar_saldo();
        System.out.println(cuenta_p1.toString());
        System.out.println(cuenta_p2.toString());
        //retirar un saldo mayor al fondo actual
        cuenta_p1.retirar(300000);
        //retirar en cuenta corriente
        cuenta_p1.retirar(100000);
        //sobrepasa el saldo minimo
        cuenta_p2.retirar(100000);
        //retiro menor al saldo minimo 
        cuenta_p2.retirar(20000);
        //ingresar saldo
        cuenta_p2.ingresar(20000);
        cuenta_p2.actualizar_saldo();
        System.out.println(cuenta_p2.toString());
        
    }
}
