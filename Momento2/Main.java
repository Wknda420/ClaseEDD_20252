//import.java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        ClaseTarea normal = new ClaseTarea("T1", "Tarea normal", 1);
        ClaseTarea urgente = new ClaseTarea("T2", "Tarea urgente", 3);
        ClaseTarea media = new ClaseTarea("T3", "Tarea media", 2);

        gestor.agregarTarea(normal);
        gestor.agregarTarea(urgente);
        gestor.agregarTarea(media);
        
        ClaseTarea procesada = gestor.procesarSiguienteTarea();
        System.out.println("Procesada: " + procesada.getId());

        System.out.println("Estado T2: " + gestor.consultarEstadoTarea("T2"));
        System.out.println("Estado T1: " + gestor.consultarEstadoTarea("T1"));
        System.out.println("Estado T99: " + gestor.consultarEstadoTarea("T99"));

        
    }
}

//main con arraylist

/*public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        ClaseTarea t1 = new Tarea("T001", "Tarea baja 1", 1);
        ClaseTarea t2 = new Tarea("T002", "Tarea urgente 1", 3);
        ClaseTarea t3 = new Tarea("T003", "Tarea media 1", 2);
        ClaseTarea t4 = new Tarea("T004", "Tarea baja 2", 1);
        ClaseTarea t5 = new Tarea("T005", "Tarea urgente 2", 3);
        ClaseTarea t6 = new Tarea("T006", "Tarea media 2", 2);


        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);
        gestor.agregarTarea(t4);
        gestor.agregarTarea(t5);
        gestor.agregarTarea(t6);

        System.out.println("=== TAREAS ORDENADAS POR PRIORIDAD ===");
        ArrayList<ClaseTarea> ordenadas = gestor.obtenerTareasOrdenadasPorPrioridad();
        
        for (ClaseTarea tarea : ordenadas) {
            String prioridadTexto = "";
            switch (tarea.getPrioridad()) {
                case 1: prioridadTexto = "BAJA"; break;
                case 2: prioridadTexto = "MEDIA"; break;
                case 3: prioridadTexto = "ALTA"; break;
            }
            System.out.println("- " + tarea.getId() + " (Prioridad: " + prioridadTexto + ")");
        }
    }
}*/
