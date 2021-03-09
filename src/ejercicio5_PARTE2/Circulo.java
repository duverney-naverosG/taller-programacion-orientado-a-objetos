/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_PARTE2;

/**
 *
 * @author DUVER NAVEROS
 */
public class Circulo extends Figura{
    private double radio;
    Circulo(float radio){
        this.radio=radio;
    }
    @Override
    public double area(){
        area=((3.1415*Math.pow(radio, 2)));
        return area;
    }
}
