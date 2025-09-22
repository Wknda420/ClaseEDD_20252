import java.util.Stack;
import java.util.Arrays;


public class PruebaAddAll {
    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();
        pila.add("Amarillo");
        pila.add("Verde");
        pila.add("Morado");

        System.out.println("Pila comun: " + pila);

        //agragar varios elementos al instante
        pila.addAll(Arrays.asList("Rojo","Negro","Blanco"));

        System.out.println("Pila con AddAll: " + pila);

        //ultimo elemento
        System.out.println("Ultimo elemento agregado: " + pila.peek());


    }
}
