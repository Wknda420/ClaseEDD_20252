public class ClaseTarea {
    private String id;
    private String descripcion;
    private int prioridad;
    private long tiempoLlegada;

    public ClaseTarea(String id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.tiempoLlegada = System.currentTimeMillis();
    }
}