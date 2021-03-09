//Coche: con un motor, cuatro ruedas y dos puertas; con los métodos que te parezcan adecuados
package ejercicio9;
//@author DUVERNEY NAVEROS COD.20201187763
public class Coche {
    private int motor;
    private int ruedas;
    private int puertas;
    private String color;
    private String placa;
    
    public Coche(String color, String placa){
        motor=1;
        ruedas=4;
        puertas=2;
        this.color=color;
        this.placa=placa;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    @Override
    public String toString() {
        return "cant motor=" + motor + ",numero de ruedas=" + ruedas + ", numero de puertas=" + puertas + ", color=" + color + ", placa=" + placa + '}';
    }
    
    
}
