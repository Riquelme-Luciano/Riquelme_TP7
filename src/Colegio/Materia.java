package Colegio;

public class Materia {
    
    private int idMateria;

    private String nombre;

    private int anio;
    
    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    // Sí lo que ingreso es una materia, lo casteo
    // Luego si tiene el mismo id devuelvo true sino false.
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Materia) {
            Materia other=(Materia) obj;
            if(this.idMateria==other.idMateria)
                return true;
            else
                return false;
        } else 
            return false;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
