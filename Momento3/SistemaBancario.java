package Momento3;
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorBancario gestor = new GestorBancario();


        //ejemplos de datos

        System.out.println("Cargando datos...");
        gestor.crearCuenta("001", "Juanito Alimaña", 5000, "Ahorro");
        gestor.crearCuenta("002", "Young Miko", 10000, "Corriente");
        gestor.crearCuenta("003", "Carlos Lopez", 7500, "Ahorro");
        System.out.println();

        boolean salir = false;

        while (!salir) {
            mostrarMenu();

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearCuentaMenu(scanner, gestor)
                    break;

                case 2:
                    consultarSaldoMenu(scanner, gestor);
                    break;
                
                case 3:
                    depositarMenu(scanner, gestor);
                    break;
                    
                case 4:
                    retirarMenu(scanner, gestor);
                    break;

                case 5:
                    transferirMenu(scanner, gestor);
                    break;

                case 6:
                    gestor.mostrarCuentas();
                    break;

                case 7:
                    gestor.ordenarPorSaldo();
                    break;

                case 8:
                    gestor.ordenarPorTitular();
                    break;

                case 9:
                    gestor.mostrarHistorial();
                    break;

                case 10:
                    mostrarUltimasMenu(scanner, gestor);
                    break;

                case 11:
                    gestor.generarReporte();
                    break;

                case 12:
                    actualizarCuentaMenu(scanner, gestor);
                    break;

                case 13:
                    eliminarCuentaMenu(scanner, gestor);
                    break;

                case 0:
                    System.out.println("¡Adios!");
                    salir = true;
                    break;

                default: 
                System.out.println("Opcion no valida");
            }

            if (!salir) {
                System.out.println("Enter para continuar...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
