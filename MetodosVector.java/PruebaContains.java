import java.util.Stack;

public class PruebaContains {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("manzana");
        pila.push("banana");
        pila.push("naranja");
        pila.push("uva");

        System.out.println("               ");
        System.out.println("Pila: " + pila);
        System.out.println("--------------------------------------");

        //probar los contains

        System.out.println("¿Contiene 'naranja'? " + pila.contains("naranja"));
        System.out.println("¿Contiene 'manzana'? " + pila.contains("manzana"));
        System.out.println("¿Contiene 'banana'? " + pila.contains("banana"));
        System.out.println("--------------------------------------");


        System.out.println("¿Contiene 'fresa'? " + pila.contains("fresa"));
        System.out.println("¿Contiene 'piña'? " + pila.contains("piña"));
        System.out.println("                         ");

        //prueba con null
        pila.push(null);
        System.out.println("Después de agregar null:");
        System.out.println("Pila: " + pila);
        System.out.println("¿Contiene null? " + pila.contains(null));

        //prueba q contains busca en toda la pila
        System.out.println("-----------------------------------------");
        System.out.println("Cima de la pila: " + pila.peek());
        System.out.println("¿Contiene 'manzana'(esta abajo del todo)? " + pila.contains("manzana"));
    }
}
