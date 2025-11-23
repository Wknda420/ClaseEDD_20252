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

    private static void mostrarMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Sistema Bancario");
        System.out.println("=".repeat(50));
        System.out.println("1. Crear cuenta");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Crear cuenta");
        System.out.println("4. Depositar");
        System.out.println("5. Retirar");
        System.out.println("6. Transferir");
        System.out.println("7. Mostrar todas las cuentas");
        System.out.println("8. Ordenar por saldo");
        System.out.println("9. Ordenar por titular");
        System.out.println("10. Mostrar historial");
        System.out.println("11. Mostrar ultimas transacciones");
        System.out.println("12. Actualizar cuenta");
        System.out.println("13. Eliminar cuenta");
        System.out.println("0. Salir");
        System.out.println("=".repeat(50));
        System.out.println("Opcion: ");
    }
    private static void crearCuentaMenu(Scanner scanner, GestorBancario gestor) {
        System.out.println("-----CREAR NUEVA CUENTA-----");
        System.out.println("Numero de cuenta: ");
        String numero = scanner.nextLine();
        System.out.println("Titular: ");
        String titular = scanner.nextLine();
        System.out.println("Saldo incial: $");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Tipo (Ahorro/Corriente): ");
        String tipo = scanner.nextLine();

        gestor.crearCuenta(numero, titular, saldo, tipo);
    }

    private static void consultarSaldoMenu(Scanner scanner, GestorBancario gestor) {
        System.out.print("Numero de cuenta: ");
        String numero = scanner.nextLine();
        gestor.consultarSaldo(numero);
    }
    private static void depositarMenu (Scanner scanner, GestorBancario gestor) {
        System.out.println("---REALIZAR DEPOSITO---");
        System.out.println("Numero de cuenta: ");
        String cuenta = scanner.nextLine();
        System.out.println("Monto a depositar: $");
        double monto = scanner.nextDouble();
        scanner.nextLine();

        gestor.depositar(cuenta, monto);
    }
    private static void retirarMenu(Scanner scanner, GestorBancario gestor) {
        System.out.println("---REALIZAR RETIRO---");
        System.out.println("Numero de cuenta: ");
        String cuenta = scanner.nextLine();
        System.out.println("Monto a retirar: $");
        double monto = scanner.nextDouble();
        scanner.nextLine();

        gestor.retirar(cuenta, monto);
    }
    private static void transferirMenu(Scanner scanner, GestorBancario gestor) {
        System.out.println("--- TRANSFERIR FONDOS ---");
        System.out.print("Cuenta origen: ");
        String origen = scanner.nextLine();
        System.out.print("Cuenta destino: ");
        String destino = scanner.nextLine();
        System.out.print("Monto a transferir: $");
        double monto = scanner.nextDouble();
        scanner.nextLine();
        
        gestor.transferir(origen, destino, monto);
    }
    private static void mostrarUltimasMenu(Scanner scanner, GestorBancario gestor) {
        System.out.print("¿Cuántas transacciones desea ver?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        gestor.mostrarUltimas(cantidad);
    }
    private static void actualizarCuentaMenu(Scanner scanner, GestorBancario gestor) {
        System.out.println("\n--- ACTUALIZAR CUENTA ---");
        System.out.print("Número de cuenta: ");
        String numero = scanner.nextLine();
        System.out.print("Nuevo nombre del titular: ");
        String nuevoTitular = scanner.nextLine();
        
        gestor.actualizarCuenta(numero, nuevoTitular);
    }
}
