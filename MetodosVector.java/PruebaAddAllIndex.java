import java.util.Stack;
import java.util.List;

public class PruebaAddAllIndex {

    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();
        pila.add("A");
        pila.add("E");

        System.out.println("Antes: " + pila);

        //se inserta en medio de "a" y "e"

        pila.addAll(1, List.of("B","C","D"));

        System.out.println("Despues: " + pila);

        //ultimo elemento
        System.out.println("Cima: " + pila.peek());
    }
}