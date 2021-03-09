/*Crea una lista de personas (con la clase Vector) y prueba a añadir varios alumnos 
y varios profesores a la lista y sus operaciones.
 */
package ejercicio7_PARTE2;

import java.util.Vector;
//@author DUVERNEY NAVEROS COD.20201187763

public class main {
    public static void main(String[] args){
     //crear vector
     Vector<Persona> persona = new Vector<Persona>();
     //crear personas
     Estudiante persona1 = new Estudiante("duverney", "naveros", 1007682071, "carrera 33 #30-26",2020187763);
     Profesor persona2 = new Profesor("jorgue","martinez",26460272,"calle 25 a#5-240","faculdad de educacion-segundo piso");
     Estudiante persona3 = new Estudiante("cristian", "perez", 7723052, "calle 33 # 50-55",2020187682);
     Profesor persona4 = new Profesor("camilo","perez",56892346,"calle 66A #45-86","faculdad de ingenieria-tercer piso");
     //se agregan los objetos creados
     persona.add(persona1);
     persona.add(persona2);
     persona.add(persona3);
     persona.add(persona4);
     //se recorre el vector personas
     for(int i=0;i<persona.size();i++){
         System.out.println(persona.get(i)+"\t");
     }
     //comprobar el metodo identificate()
     persona1.identificate();
     persona2.identificate();
     persona3.identificate();
     persona4.identificate();
    }
}
