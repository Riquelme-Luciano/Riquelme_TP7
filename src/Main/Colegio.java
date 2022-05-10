package Main;

import Colegio.Alumno;
import Colegio.Materia;

public class Colegio {

    public static void main(String[] args) {
      
        Materia inglesUno = new Materia(01, "Ingles I", 1);
        Materia matematicasUno = new Materia(02, "Matematicas I", 1);
        Materia laboratorioUno = new Materia(03, "Laboratorio 1", 1);

        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");

        
        lopez.agregarMateria(inglesUno);
        lopez.agregarMateria(matematicasUno);
        lopez.agregarMateria(laboratorioUno);
        
        
        martinez.agregarMateria(inglesUno);
        martinez.agregarMateria(matematicasUno);
        martinez.agregarMateria(laboratorioUno);
        martinez.agregarMateria(laboratorioUno);
        
        System.out.println("Cantidad de materias inscripto Lopez: " + lopez.cantindadMaterias());
        System.out.println("Cantidad de materias inscripto Martinez: " + martinez.cantindadMaterias());
        
    }
    
}
