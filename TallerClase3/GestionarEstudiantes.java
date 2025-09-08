package TallerClase3;

public class GestionarEstudiantes {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];
        int totalEstudiantes = 0;


        estudiantes[totalEstudiantes] = new Estudiante("Ana", "2023001", 4.5);
        totalEstudiantes++;
        
        estudiantes[totalEstudiantes] = new Estudiante("Carlos", "2023002", 3.8);
        totalEstudiantes++;
        
        estudiantes[totalEstudiantes] = new Estudiante("Maria", "2023003", 4.2);
        totalEstudiantes++;
    }
}
