package clase7;
import java.util.Stack;

public class PilasColas {
    public static void main(String[] args) {
        
        //Pilas en JAVA (Stack)
        //Se crea el obejto pila de tipo stack

        Stack<Integer> pila = new Stack<>();

        //se verifica si la pila esta vacia

        System.out.println("La pila esta vacia? " + pila.empty());

        //se insertan 5 numeros enteros a la pila

        pila.push(10);
        pila.push(20);
        pila.push(5);
        pila.push(9);
        pila.push(35);

        //se insertan 5 numeros enteros a la pila

        System.out.println("La pila esta vacia? " + pila.empty());

        //se imprime la pila
        //mostrar pila

        System.out.println(pila);

        //se obtiene el elemento que se encuentra en el tope de la pila sin removerlo
        //tope de la pila

        System.out.println(pila.peek());

        //se elimina el ultimo elemento de la pila 
        //elimino el tope de la pila

        pila.pop();
        System.out.println(pila.peek());

        //se imprime la pila
        System.out.println(pila);

        //search
        //se obtiene la posicion de cada elemento dentro de la pila

        System.out.println(pila.search(9));
        System.out.println(pila.search(5));
        System.out.println(pila.search(20));
        System.out.println(pila.search(10));

        //buscamos un elemento que no este dentro de a pila, muestra -1 cuando no lo encuetra
        System.out.println(pila.search(50));


    }
}