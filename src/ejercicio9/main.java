/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author DUVER NAVEROS
 */
public class main {
    public static void main(String[] args){
        Coche coche1 = new Coche("rojo","ABC-123");
        Motor motor1 = new Motor();
        Puerta puerta1 = new Puerta();
        Rueda rueda = new Rueda();
        Ventana ventana = new Ventana();
        System.out.println("coche "+coche1.toString());
        motor1.arrancar(100);
        System.out.println("motor "+motor1.toString());
        puerta1.abrir_puerta();
        //PUERTA true=abierta   false=cerrada
        System.out.println("puerta "+puerta1.toString());
        //rueda desinflar
        System.out.println("rueda "+rueda.desinfar());
        ventana.abrir_ventana();
        //PUERTA true=abierta   false=cerrada
        System.out.println("ventana "+ventana.toString());
    }
}
