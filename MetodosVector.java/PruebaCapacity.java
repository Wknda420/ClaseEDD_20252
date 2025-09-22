import java.util.Stack;

public class PruebaCapacity {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        System.out.println("Pila recien creada:");
        System.out.println("Tamaño: " + pila.size());
        System.out.println("Capacidad: " + pila.capacity());
        System.out.println("-----------------------------------");

        //al agregar elementos

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Despues de 3 elementos: ");
        System.out.println("Tamaño: " + pila.size());
        System.out.println("Capacidad: " + pila.capacity());

    }
}