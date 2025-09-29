

import java.util.Stack;

public class Pan {
    public static boolean panSimilar(String[] sandwich1, String[] sandwich2) {
        Stack<String> pila1 = new Stack<>();
        Stack<String> pila2 = new Stack<>();

        for (String ingredientes: sandwich1) {
            pila1.push(ingredientes);
        }

        for (String ingredientes: sandwich2) {
            pila2.push(ingredientes);
        }

        if (!pila1.pop().equals(pila2.pop())){ 

        return false;
        }

        while (pila1.size()> 1) {
            pila1.pop();
        }

        while (pila2.size()> 1) {
            pila2.pop();
        }
        return pila1.pop().equals(pila2.pop());

    }

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("¿Usan el mismo tipo de pan?");
        System.out.println(panSimilar(
            new String[]{"pan blanco", "lechuga", "pan blanco"},
            new String[]{"pan blanco", "tomate", "pan blanco"}
        ));

        System.out.println("");
        System.out.println("Usan el mismo tipo de pan?");
        System.out.println(panSimilar(
            new String[]{"pan integral", "pollo", "pan integral"},
            new String[]{"pan blanco", "pollo", "pan blanco"}
        ));
    }
}
