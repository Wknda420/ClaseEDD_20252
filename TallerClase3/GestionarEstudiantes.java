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

        System.out.println("Estudiantes agregados: ");
        for (int i = 0; i < totalEstudiantes; i++) {
            estudiantes[i].mostrarInf();
        }

        String matriculaBuscada = "200207";
        boolean encontrado = false;
         
        for (int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes [i].getMatricula().equals(matriculaBuscada)) {
                System.out.println("Estudiante encontrado:");
                estudiantes[i].mostrarInf();
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("Estudiante no encontrado");
        }
        
        String matriculaEliminar = "2023002";
        encontrado = false;
        
        for (int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getMatricula().equals(matriculaEliminar)) {
                System.out.println("Eliminando a: " + estudiantes[i].getNombre());

                
}
