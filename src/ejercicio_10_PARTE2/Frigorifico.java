package ejercicio_10_PARTE2;
//@author DUVERNEY NAVEROS  COD.20201187763

public class Frigorifico extends Electrodomestico implements MuestraInformacion {
    private double temperatura;

    public Frigorifico(double c, String m, double temperatura) {
        super(c, m);
        this.temperatura=temperatura;
    }

    @Override
    public String toString() {
        return "modelo: "+modelo+" consumo: "+consumo+" temperatura: "+temperatura;
    }
    @Override
    public String muestra() {
        return "temperatura: "+temperatura;
    }
}
