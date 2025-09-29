
import java.util.Stack;

public class Votos {
    public static int calculo(int afavor, int encontra) {
        
        Stack<Integer> pila = new Stack<>();

        pila.push(afavor);
        pila.push(encontra);

        int contra = pila.pop();
        int favor = pila.pop();

        return favor - contra;
    }

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Recuento de votos N°1:");
        System.out.println(calculo(20, 9));
        System.out.println(" ");
        System.out.println("Recuento de votos N°2:");
        System.out.println(calculo(2, 33));
        System.out.println(" ");
        System.out.println("Recuento de votos N°3:");
        System.out.println(calculo(20, 20));

    }
}
