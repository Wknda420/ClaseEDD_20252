import java.util.Stack;

public class PruebaVectoradd {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        //Añade los numeros
        pila.add(10);
        pila.add(20);
        pila.add(30);

        //Mostrar la pila
        System.out.println("Pila de numeros: " + pila);

        System.out.println("Tamaño: " + pila.size());
        System.out.println("Ultimo numero añadido: " + pila.peek());

        //si quisiera añadir mas numeros
        pila.add(40);
        pila.add(50);

        //que muestre la pila depsues de los numeros añadidos
        System.out.println("Pila despues de añadir mas numeros: " + pila);
    }
    
}
