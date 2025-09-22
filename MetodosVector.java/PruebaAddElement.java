import java.util.Stack;

public class PruebaAddElement {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.addElement(100);
        pila.addElement(200);
        pila.addElement(300);

        System.out.println("Pila: " + pila);
        System.out.println("Tamaño: " + pila.size());
        System.out.println("Cima: " + pila.peek());

        //funciona igual que push y add

        pila.push(400);
        pila.add(500);

        System.out.println("Pila con los demas metodos: " + pila);

        System.out.println("Ultimo elemento: " + pila.peek());
        
    }
}
