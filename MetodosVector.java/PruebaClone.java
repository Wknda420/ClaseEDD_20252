import java.util.Stack;

public class PruebaClone {
    public static void main(String[] args) {
        Stack<String> Original = new Stack<>();

        Original.push("Gato Siames");
        Original.push("Gato Persa");
        Original.push("Gato Carey");

        System.out.println("Pila original: " + Original);

        Stack<String> clone = (Stack<String>) Original.clone();

        System.out.println("Copia: " + clone);

        //verificar contenido
        System.out.println("¿Tienen el mismo contenido? " + Original.equals(clone));
        

    }
}
