package TallerEstructuradeDatos;

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

        

        return false;

    }
}
