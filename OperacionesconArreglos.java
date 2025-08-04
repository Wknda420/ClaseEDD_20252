import java.util.Random;

public class OperacionesconArreglos {

    //Metodo para llenar un arreglo de enteros
    public int[] llenarArreglo(int tam){

        Random rand = new Random();

        int[] numeros = new int[tam];
        for(int i = 0 < numeros.length; i++){
            numeros[i] = rand.nextInt(100 - 1) + 1; 
        }



        return numeros;
    }

}