import java.util.*;

public class GestorTareas {
    private Queue<Tarea> colaEspera = new LinkedList<>();
    private Stack<Tarea> pilaPrioritaria = new Stack<>();
    private Map<String, String> registroTrazabilidad = new HashMap<>();

    public void agregarTarea(Tarea tarea){
        if (tarea.getPrioridad() == 3){
            pilaPrioritaria.push(tarea);
        }
        else{
            colaEspera.add(tarea);
        }
    }
    public Tarea procesarSiguienteTarea(){
        if(!pilaPrioritaria.empty()){
            Tarea tarea = pilaPrioritaria.pop();

            registrarTareaCompletada(tarea);
            return tarea;
        }
        else if (!colaEspera.empty()){
            Tarea tarea = colaEspera.poll();

            registrarTareaCompletada(tarea);
            return tarea;
        }
        return null;
    }
    private void registrarTareaCompletada(Tarea tarea) {
        long tiempoProcesamiento = System.currentTimeMillis() - tarea.getTiempoLlegada();

        String estado = "Completada en " + tiempoProcesamiento + " ms";
        registroTrazabilidad.put(tarea.getId(), estado);
    }
    public String consultarEstadoTarea(String idTarea){
        if (registroTrazabilidad.containsKey(idTarea)){
            return "Completada";
        }
    }
}
