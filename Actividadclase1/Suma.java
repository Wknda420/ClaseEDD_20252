public class Suma {
    public static void main (String[] args) {
        int [] numeros = {3, 8, 1, 5, 9};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los elemetos es: " + suma);
    }
}