public class NumerosRepetidos {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 8, 9, 1, 7, 3, 2};
        System.out.println("Los numeros repetidos: ");

        for (int i=0; i < numeros.length; i++) {
            boolean esRepetido = false;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    esRepetido = true;
                    break;
                }
            
            }
            if (esRepetido) {
                continue;
            }
            int contador = 0;
            for (int j = i; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            if (contador > 1) {
                System.out.println(numeros[i] + "(aparece " + contador + " veces)");
            }
        }
    }
    
}
