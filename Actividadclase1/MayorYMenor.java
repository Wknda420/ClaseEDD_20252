public class MayorYMenor {
    public static void main(String[] args) {
        int[] numeros = {15, 9, 22, 5, 45, 13, 7};

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1, i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; 
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
