public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        ClaseTarea normal = new ClaseTarea("T1", "Tarea normal", 1);
        ClaseTarea urgente = new ClaseTarea("T2", "Tarea urgente", 3);
        ClaseTarea media = new ClaseTarea("T3", "Tarea media", 2);

        gestor.agregarTarea(normal);
        gestor.agregarTarea(urgente);
        gestor.agregarTarea(media);
    }
}
