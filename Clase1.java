public class Clase1 {
    public static void main (String []args){

        System.out.println("Estructura de datos");

        //arreglos o arrays o vectores

        //declaracion del arreglo. Forma 1

        //int[] numeros;
        //numeros = new int[5];


        //Declaracion del arrelgo. Forma 2

        //int[] numeros = new int[5];


        //Declaracion e inicializacion
        
        //int[] numeros = {10, 20, 30 ,40 50};

        OperacionesconArreglos objArreglo = new OperacionesconArreglos();

        int[] numeros = objArreglo.llenarArreglo(5);

        System.out.println(Arrays.toString(numeros));

    }
}