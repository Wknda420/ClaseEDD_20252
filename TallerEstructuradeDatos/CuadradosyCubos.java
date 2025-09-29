import java.util.LinkedList;
import java.util.Queue;

public class CuadradosyCubos {
    
    public static boolean verificacion(int[] numeros) {
        Queue<Integer> cola = new LinkedList<>();
        
        for (int num : numeros) {
            cola.offer(num);
        }
        
        int primerNumero = cola.poll();
        
          
        int segundoNumero = cola.poll();
        
        
        return Math.sqrt(primerNumero) == Math.cbrt(segundoNumero);
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("¿La raiz es igual?");
        System.out.println(verificacion(new int[]{4, 8}));  

        System.out.println("");
        System.out.println("¿La raiz es igual?");
        System.out.println(verificacion(new int[]{16, 48}));   

        System.out.println("");
        System.out.println("¿La raiz es igual?");
        System.out.println(verificacion(new int[]{9, 27}));    
    }
}