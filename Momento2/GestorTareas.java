import java.util.*;

public class GestorTareas {
    private Queue<Tarea> colaEspera = new LinkedList<>();
    private Stack<Tarea> pilaPrioritaria = new Stack<>();
    private Map<String, String> registroTrazabilidad = new HashMap<>();
}
