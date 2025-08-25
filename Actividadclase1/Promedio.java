public class Promedio {
    public static void main(String[] args) {
        int[] numeros = {12, 22, 45, 50, 70};
        int suma = 0;

        //suma los elementos
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        //promedio
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio es de: " + promedio);
    }
    
}
