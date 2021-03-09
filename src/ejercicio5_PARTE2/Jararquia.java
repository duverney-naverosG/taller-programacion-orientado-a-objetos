package ejercicio5_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

import java.util.ArrayList;

public class Jararquia {
    public static void main(String[] args){
        ArrayList<Figura> figuras = new ArrayList<Figura>(); 
        figuras.add(new Circulo(10)); // Radio=10
        figuras.add(new Cuadrado(10)); // Lado=10
        figuras.add(new Triangulo(10, 5)); // Base=10, Altura=5;
        for (Figura f : figuras){
             System.out.println("Área: " + f.area());
        }
    }
}
