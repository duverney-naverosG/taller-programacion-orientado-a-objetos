package ejercicio9_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class main {
    public static void main(String[] args){
        PuertaCoche puerta1 = new PuertaCoche("automovil, marca Renault, año 2020 con 10 caballos de fuerza ágil, dinámico y elegante con un diseño expresivo y robusto.", 1775, 80000000);
        //se muestra los valores de los atributos
        System.out.println(puerta1.toString());
        puerta1.cerrar();
        puerta1.bloquea();
        puerta1.activarAlarma();
        //se muestra el estado de la puerta
        System.out.println("estado de la puerta: "+puerta1.estado_carro());
        puerta1.desactivarAlarma();
        puerta1.desbloquea();
        puerta1.abrir();
        //se muestra el estado de la puerta
        System.out.println("estado de la puerta: "+puerta1.estado_carro());
    }
}
