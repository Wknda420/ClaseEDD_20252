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
    public String getId() {return id;}
    public int getPrioridad() {return prioridad;}
    public long getTiempoLlegada() {return tiempoLlegada;}
}