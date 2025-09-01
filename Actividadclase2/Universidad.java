package Actividadclase2;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void mostrarEstudiantesPorFacultad() {
        int ciencias = 0;
        int humanidades = 0;
        int medicina = 0;
        int general = 0;

        for (Estudiante estudiante : estudiantes){
            for (String curso : estudiante.getCursos()){
                if (curso == "Matematicas" || curso == "Fisica" || curso == "Programacion"){
                    ciencias++;
                } else if (curso == "Historia" || curso == "Literatura"){
                    humanidades++;
                } else if (curso == "Biologia" || curso == "Quimica" || curso == "Anatomia"){
                    medicina++;
                } else {
                    general++;
                }
            } 
        }

        System.out.println("Facultad de Ciencias: " + ciencias + " estudiantes");
        System.out.println("Facultad de Humanidades: " + humanidades + " estudiantes");
        System.out.println("Facultad de Medicina: " + medicina + " estudiantes");
        System.out.println("Facultad General: " + general + " estudiantes");
    }
}
