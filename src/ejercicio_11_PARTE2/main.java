//clase Test para probar las operaciones que soporta.
package ejercicio_11_PARTE2;
//@author DUVERNEY NAVEROS COD.20201187763

public class main {
    public static void main(String[] args){
        Nota nota1 = new Nota(01, "tengo parcial de programacion el dia martes");
        NotaAlarma nota2 = new NotaAlarma(02, "tengo que entregrar taller de calculo", "10:00 AM");
        BlocNotas bloc_notas = new BlocNotas();
        bloc_notas.introducir_notas(nota1);
        bloc_notas.introducir_notas(nota2);
        //muestra todas las notas
        bloc_notas.listar_notas();
        //muestra la cantidad de notas
        System.out.println(bloc_notas.numero_notas());
        //elinamos la primara nota
        bloc_notas.eliminar_nota(1);
        //se muestra nuevamente las notas
        bloc_notas.listar_notas();
    }
}
