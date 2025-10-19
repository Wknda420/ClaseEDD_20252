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
