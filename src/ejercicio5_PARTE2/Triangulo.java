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
public class Triangulo extends Figura{
    private float altura;
    private float base;
    
    Triangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double area(){
        area=(base*altura)/2;
        return area;
    }
}
