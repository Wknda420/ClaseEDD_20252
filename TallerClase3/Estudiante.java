package TallerClase3;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double promedio;

    public Estudiante (String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    
}
