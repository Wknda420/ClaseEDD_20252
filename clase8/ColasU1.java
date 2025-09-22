import java.util.ArrayDeque;
import java.util.Queue;

public class ColasU1 {

    public static void main(String[] args) {
        
        Queue<Integer> cola = new ArrayDeque<>();

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

        

    }
}