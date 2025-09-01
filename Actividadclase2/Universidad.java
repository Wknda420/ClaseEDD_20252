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

        System.out.println("                           ");
        System.out.println("Estudiantes por facultad:");
        System.out.println("                           ");
        mostrarEstudiantesPorFacultad();

        System.out.println("                           ");
        System.out.println("Estudiantes por curso:");
        System.out.println("                           ");
        mostrarEstudiantesPorCurso();
    }

    public static void matriculaCursos(int id, String[] cursos) {
        Estudiante estudiante = new Estudiante(id, cursos);

        estudiantes.add(estudiante);

        System.out.println("                           ");
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

    public static void mostrarEstudiantesPorCurso(){
        int matematicas = 0;   
        int fisica = 0;        
        int programacion = 0;  
        int historia = 0;      
        int literatura = 0;    
        int biologia = 0;      
        int quimica = 0;       
        int anatomia = 0;      
        int otros = 0;
        
        for (Estudiante estudiante : estudiantes) {
            for (String curso : estudiante.getCursos()) {
                if (curso == "Matematicas") {
                    matematicas++;
                } else if (curso == "Física") {
                    fisica++;
                } else if (curso == "Programación") {
                    programacion++;
                } else if (curso == "Historia") {
                    historia++;
                } else if (curso == "Literatura") {
                    literatura++;
                } else if (curso == "Biología") {
                    biologia++;
                } else if (curso == "Química") {
                    quimica++;
                } else if (curso == "Anatomía") {
                    anatomia++;
                } else {
                    otros++;
                }
            }
        }
        if (matematicas > 0) System.out.println("Matemáticas: " + matematicas + " estudiantes");
        if (fisica > 0) System.out.println("Física: " + fisica + " estudiantes");
        if (programacion > 0) System.out.println("Programación: " + programacion + " estudiantes");
        if (historia > 0) System.out.println("Historia: " + historia + " estudiantes");
        if (literatura > 0) System.out.println("Literatura: " + literatura + " estudiantes");
        if (biologia > 0) System.out.println("Biología: " + biologia + " estudiantes");
        if (quimica > 0) System.out.println("Química: " + quimica + " estudiantes");
        if (anatomia > 0) System.out.println("Anatomía: " + anatomia + " estudiantes");
        if (otros > 0) System.out.println("Otros cursos: " + otros + " estudiantes");
    }
}
