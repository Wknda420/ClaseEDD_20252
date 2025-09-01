package Actividadclase2;

import java.util.List;

public class Universidad {
    private static List<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        String[] cursos1 = {"Matematicas", "Fisica", "Programacion"};
        String[] cursos2 = {"Electricidad", "Literatura"};
        String[] cursos3 = {"Biologia", "Quimica", "Anatomia"};
        
        matriculaCursos(1, cursos1);
        matriculaCursos(2, cursos2);
        matriculaCursos(3, cursos3);
        matriculaCursos(4, cursos2);

        System.out.println("Estudiantes por facultad:");
        mostrarEstudiantesPorFacultad();

        System.out.println("Estudiantes por curso:");
        mostrarEstudiantesPorCurso();
    }

    public static void matriculaCursos(int id, String[] cursos) {
        Estudiante estudiante = new Estudiante(id, cursos);

        estudiantes.add(estudiante);

        System.out.println("Estudiante" + id + " matriculado en: " + Arrays.toString(cursos));
        
    }
}
