package clase7;

import java.util.Stack;

public class ValidacionCadenasPila {
    public static void main(String[] args) {
        
        String[] llaves = {"{","{","}","}"};

        //cree una pila de llaves y verifique si las llaves estas completas, o sea una llave que abre tiene que cerrar

        Stack<String> cadenas = new Stack<>();

        for (int i = 0; i <llaves.length; i++) {
            cadenas.push(llaves[i]);
        }

        System.out.println(cadenas);
        int tam = cadenas.size();

        int contador1 = 0, contador2 = 0;
        for (int i = 0; i <tam; i++) {

            //.equals solo compara cadenas, los numeros reales o enteros y los booleanos se usa ==
            if (cadenas.peek().equals("{")) {
                contador1 += 1;
        } else {
            contador2 += 1;
        }

        cadenas.pop();
        }//operador ternario
        System.out.println(contador1 == contador2 ? "Equilibrados" : "No equlibrados");

        /*si 
        *  if (contador1 == contador2) {
                sout("equilibrados");
            }else {
                sout("No equilibrados");
            }*/
    }
}
