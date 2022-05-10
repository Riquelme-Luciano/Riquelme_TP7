    
package Colegio;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {
    
    private int legajo;

    private String apellido;

    private String nombre;

    private HashSet<Materia> materias = new HashSet <>();

    public Alumno(int p_legajo, String p_apellido, String p_nombre) {
        legajo=p_legajo;
        apellido=p_apellido;
        nombre=p_nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo=legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

        
    // añado a la lista 'materiasAl' una materia y 
    // devuelto true si se añadio, sino devuelvo false
    public boolean agregarMateria(Materia m) {
        if(materias.add(m)) {
            JOptionPane.showMessageDialog(null,"Alumno Inscripto");
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"El alumno ya estaba inscripto");
            return false;
        }
    }
    
    //devuelvo la cantidad de materias añadidas en la lista.
    public int cantindadMaterias() {
        return materias.size();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.legajo;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj!=null) {
            if (obj instanceof Alumno) {
                Alumno other=(Alumno)obj;
                if (this.legajo==other.legajo) 
                    return true;
                else 
                    return false;
            } else
                  return false;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
}

/*
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;

*/
    /* 
        public void agregarMateria(materia m) {
            if(materias.add(m)==true) {
                JOptionPane.showMessageDialog(null,"El alumno se inscribio correctamente");
            } else
                JOptionPane.showMessageDialog(null,"El alumno ya se encuentra inscripto");
        }
    */

/*
        escritorio.removeAll();
        escritorio.repaint();
        AltaAlumnos a1 = new AltaAlumnos(alum);
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
*/