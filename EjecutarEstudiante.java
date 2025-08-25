import java.util.Arrays;

public class EjecutarEstudiante {
    
    public static void main(String[] args){

        //Forma 1
        //Creación de los objetos
        Clase2Estudiante objEst1 = new Clase2Estudiante(909876, "Juanito", "Perez", "Ingeniería");
        Clase2Estudiante objEst2 = new Clase2Estudiante(456098, "Anita", "Cano", "Ingeniería");
        Clase2Estudiante objEst3 = new Clase2Estudiante(235621, "Mercedes", "De Jesús", "Ingeniería");

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        System.out.println("--------------------------");
        //Crear arreglo de objetos
        // int[] a = new int[5];
        Clase2Estudiante[] est = new Clase2Estudiante[5];
        
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;

        //Forma 2

        est[3] = new Clase2Estudiante(506070, "Byron", "Beltran", "Psicología");
        est[4] = new Clase2Estudiante(304050, "Antonio", "Buitrago", "Derecho");

        System.out.println(Arrays.toString(est));

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");

        for(Clase2Estudiante e: est){
            System.out.println(e);
        }

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");

        for(int i = 0; i < est.length; i++){
            System.out.println(est[i]);
        }

    }
}