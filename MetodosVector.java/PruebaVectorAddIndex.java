import java.util.Stack;

public class PruebaVectorAddIndex {

    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<>();

        pila.add(30);
        pila.add(40);
        pila.add(50);

        System.out.println("Pila: " + pila);

        //insertar en un lado especifico
        pila.add(0, 20);

        //mostrar pila de nuevo
        System.out.println("Pila despues de agregar al principio un numero: " + pila);

        //insertar en medio
        pila.add(2, 25);

        System.out.println("Pila despues de agregar un elemento en el medio: " + pila);
    }
}