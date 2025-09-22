import java.util.Stack;

public class PruebaClear {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.push(1000);
        pila.push(2000);

        System.out.println("Pila:" + pila);
        System.out.println("Tamaño: " + pila.size());
        System.out.println("¿Esta vacia? " + pila.empty());
        System.out.println("------------------------------");

        pila.clear();

        System.out.println("Pila despues de clear: " + pila);
        System.out.println("Tamaño: " + pila.size());
        System.out.println("¿Esta vacia? " + pila.empty());


    }
}