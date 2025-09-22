import java.util.Stack;
import java.util.List;

public class PruebaAddAllIndex {

    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();
        pila.add("A");
        pila.add("E"); //0: A , 1: E

        System.out.println("Antes: " + pila);

        //se inserta en medio de "a" y "e"

        pila.addAll(1, List.of("B","C","D"));

        System.out.println("Despues: " + pila);

        //ultimo elemento
        System.out.println("Cima: " + pila.peek());
    }
}