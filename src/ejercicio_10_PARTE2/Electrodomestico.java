package ejercicio_10_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class Electrodomestico {
    //puse los atributos protected para poder mostralos en el toString de la clase Frigorifico
    protected double consumo;
    protected String modelo;

    public Electrodomestico(double c, String m) {
        consumo = c;
        modelo = m;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " Consumo: " + consumo;
}
}
