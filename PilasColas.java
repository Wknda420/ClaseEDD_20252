import java.util.Stack;

public class PilasColas {
    public static void main(String[] args) {
        
        //Pilas en JAVA (Stack)

        Stack<Integer> pila = new Stack<>();

        System.out.println("La pila esta vacia? " + pila.empty());

        pila.push(10);
        pila.push(20);
        pila.push(5);
        pila.push(9);
        pila.push(35);

        System.out.println("La pila esta vacia? " + pila.empty());

        //mostrar pila

        System.out.println(pila);

        //tope de la pila

        System.out.println(pila.peek());

        //ultimo elemento de la pila

        pila.pop();
        System.out.println(pila.peek());
        System.out.println(pila);


    }
}