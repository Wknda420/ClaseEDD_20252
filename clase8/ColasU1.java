import java.util.ArrayDeque;
import java.util.Queue;

public class ColasU1 {

    public static void main(String[] args) {
        
        Queue<Integer> cola = new ArrayDeque<>();

        System.out.println("                       ");
        System.out.println(cola.peek()); //aqui deberia retornar null
        System.out.println("--------");

        cola.add(5);
        cola.add(10);
        cola.add(3);
        cola.add(20);

        System.out.println("Cola:");
        System.out.println(cola); //[15,10,3,20]
        System.out.println("           ");

        //primer elemento de la cola
        System.out.println("Primer elemento:");
        System.out.println(cola.element());
        System.out.println("                  ");

        //offer - agregar un elemento retorna un true
        System.out.println(cola.offer(9));
        System.out.println(cola);
        System.out.println("               ");

        System.out.println(cola.peek());
        System.out.println("--------------------");

        //poll - devuelve null si esta vacia, remueve un elemento
        System.out.println("Remueve el elemento: ");
        System.out.println(cola.poll());
        System.out.println("                ");

        System.out.println("Tamaño de la cola: " + cola.size());
        System.out.println("               ");

        //remueve
        System.out.println("Remueve  el elemento: ");
        System.out.println(cola.remove());
        System.out.println("                ");

        //limpiar la cola, borra todo de la cola
        cola.clear();

        System.out.println(cola.poll());//retorna null
        System.out.println("             ");


    }
}