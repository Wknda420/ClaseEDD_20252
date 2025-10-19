import java.util.*;

public class GestorTareas {
    private Queue<ClaseTarea> colaEspera = new LinkedList<>();
    private Stack<ClaseTarea> pilaPrioritaria = new Stack<>();
    private Map<String, String> registroTrazabilidad = new HashMap<>();

    public void agregarTarea(ClaseTarea tarea){
        if (tarea.getPrioridad() == 3){
            pilaPrioritaria.push(tarea);
        }
        else{
            colaEspera.add(tarea);
        }
    }
    public ClaseTarea procesarSiguienteTarea(){
        if(!pilaPrioritaria.empty()){
            ClaseTarea tarea = pilaPrioritaria.pop();

            registrarTareaCompletada(tarea);
            return tarea;
        }
        else if (!colaEspera.isEmpty()){
            ClaseTarea tarea = colaEspera.poll();

            registrarTareaCompletada(tarea);
            return tarea;
        }
        return null;
    }
    private void registrarTareaCompletada(ClaseTarea tarea) {
        long tiempoProcesamiento = System.currentTimeMillis() - tarea.getTiempoLlegada();

        String estado = "Completada en " + tiempoProcesamiento + " ms";
        registroTrazabilidad.put(tarea.getId(), estado);
    }
    public String consultarEstadoTarea(String idTarea){
        if (registroTrazabilidad.containsKey(idTarea)){
            return "Completada";
        }
        for (ClaseTarea tarea : pilaPrioritaria){
            if (tarea.getId().equals(idTarea)) {
                return "Pendiente en pila prioritaria";
            }
        }
        for (ClaseTarea tarea : colaEspera) {
            if (tarea.getId().equals(idTarea)){
                return "Pendiente en cola de espera";
            }
        }
        return "ID no encontrado";
    }
}
