package Momento3;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Collections;

public class GestorBancario {
    ArrayList<Cuenta> cuentas;
    Queue<Transaccion> colaTransacciones;
    Stack<Transaccion> pilaHistorial;

    public GestorBancario(){
        this.cuentas = new ArrayList<>();
        this.colaTransacciones = new LinkedList<>();
        this.pilaHistorial = new Stack<>();
    }

    public void crearCuenta(String numero, String titular, double saldo, String tipo ) {
        if (buscarCuenta(numero) != null) {
            System.out.println("ERROR: La cuneta ya existe");
            return;
        }
        if (saldo < 0) {
            System.out.println("ERROR: El saldo no puede ser negativo");
            return;
        }
        Cuenta nueva = new Cuenta(numero, titular, saldo, tipo);
        cuentas.add(nueva);
        System.out.println("Cuenta creada de manera exitosa");
    }
    public Cuenta buscarCuenta(String numero) {
        for (Cuenta c: cuentas) {
            if (c.numeroCuenta.equals(numero)&&c.activa) {
                return c;
            }
        }
        return null;
    }
    public void actualizarCuenta(String numero, String nuevoTitular) {
        Cuenta cuenta = buscarCuenta(numero);
        if (cuenta == null) {
            System.out.println("Cuenta no encontrada :(");
            return;
        }
        cuenta.titular = nuevoTitular;
        System.out.println("La cuenta ha sido actualizada");
    }
    public void eliminarCuenta(String numero) {
        Cuenta cuenta = buscarCuenta(numero);
        if (cuenta == null) {
            System.out.println("La cuenta no ha sido encontrada");
            return;
        }
        if (cuenta.saldo > 0) {
            System.out.println("No se puede eliminar una cuenta con saldo");
            return;
        }
        cuenta.activa = false;
        System.out.println("Cuenta eliminada");
    }
    public void depositar(String numero, double monto) {
        if (monto <= 0) {
            System.out.println("El monto ingresado no es valido");
            return;
        }
        Cuenta cuenta = buscarCuenta(numero);
        if (cuenta == null) {
            System.out.println("La cuenta no fue encontrada");
            return;
        }
        Transaccion trans = new Transaccion("DEPOSITO", numero, null, monto);
        colaTransacciones.add(trans);
        procesarTransacciones();
    }
    public void retirar(String numero, double monto) {
        if (monto <= 0) {
            System.out.println("Monto invalido:(");
            return;
        }
        Cuenta cuenta = buscarCuenta(numero);
        if (cuenta == null) {
            System.out.println("La cuenta no fue encontrada");
            return;
        }
        if (cuenta.saldo < monto) {
            System.out.println("Saldo insuficiente:o");
            return;
        }
        Transaccion trans = new Transaccion("RETIRO", numero, null, monto);
        colaTransacciones.add(trans);
        procesarTransacciones();
    }
    public void transferir(String origen, String destino, double monto) {
        if (monto <= 0) {
            System.out.println("Monto invalido");
            return;
        }
        Cuenta cuentaOrigen = buscarCuenta(origen);
        Cuenta cuentaDestino = buscarCuenta(destino);

        if (cuentaOrigen == null || cuentaDestino == null) {
            System.out.println("Una de las cuentas no existe");
            return;
        }
        if (cuentaOrigen.saldo < monto) {
            System.out.println("Saldo insuficiente");
            return;
        }
        Transaccion trans = new Transaccion ("TRANSFERENCIA, origen, destino, monto", origen, destino, monto);
        colaTransacciones.add(trans);
        procesarTransacciones();
    }
    private void procesarTransacciones() {
        while (!colaTransacciones.isEmpty()) {
            Transaccion t = colaTransacciones.poll();

            if (t.tipo.equals("DEPOSITO")) {
                Cuenta c = buscarCuenta(t.cuentaOrigen);
                c.saldo += t.monto;
                System.out.println("Depósito exitoso");
                
            } else if (t.tipo.equals("RETIRO")) {
                Cuenta c = buscarCuenta(t.cuentaOrigen);
                c.saldo -= t.monto;
                System.out.println("Retiro exitoso");
                
            } else if (t.tipo.equals("TRANSFERENCIA")) {
                Cuenta origen = buscarCuenta(t.cuentaOrigen);
                Cuenta destino = buscarCuenta(t.cuentaDestino);
                origen.saldo -= t.monto;
                destino.saldo += t.monto;
                System.out.println("Transferencia exitosa");
            }

            pilaHistorial.push(t);
        }
    }
    public void ordenarPorSaldo() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas");
            return;
        }
        
        ArrayList<Cuenta> activas = new ArrayList<>();
        for (Cuenta c : cuentas) {
            if (c.activa) activas.add(c);
        }
        
        quickSort(activas, 0, activas.size() - 1);
        
        System.out.println("CUENTAS ORDENADAS POR SALDO:");
        System.out.println("=".repeat(60));
        for (Cuenta c : activas) {
            c.mostrar();
        }
    }
    private void quickSort(ArrayList<Cuenta> arr, int bajo, int alto) {
        if (bajo < alto) {
            int pi = partition(arr, bajo, alto);
            quickSort(arr, bajo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    private int partition(ArrayList<Cuenta> arr, int bajo, int alto) {
        double pivot = arr.get(alto).saldo;
        int i = bajo - 1;
        
        for (int j = bajo; j < alto; j++) {
            if (arr.get(j).saldo >= pivot) {
                i++;
                Cuenta temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        
        Cuenta temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(alto));
        arr.set(alto, temp);
        return i + 1;
    }
    public void ordenarPorTitular() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas");
            return;
        }
        
        ArrayList<Cuenta> activas = new ArrayList<>();
        for (Cuenta c : cuentas) {
            if (c.activa) activas.add(c);
        }
        
        mergeSort(activas, 0, activas.size() - 1);
        
        System.out.println("CUENTAS ORDENADAS POR TITULAR:");
        System.out.println("=".repeat(60));
        for (Cuenta c : activas) {
            c.mostrar();
        }
    }

    private void mergeSort(ArrayList<Cuenta> arr, int izq, int der) {
        if (izq < der) {
            int medio = (izq + der) / 2;
            mergeSort(arr, izq, medio);
            mergeSort(arr, medio + 1, der);
            merge(arr, izq, medio, der);
        }
    }

    private void merge(ArrayList<Cuenta> arr, int izq, int medio, int der) {
        ArrayList<Cuenta> temp = new ArrayList<>();
        int i = izq, j = medio + 1;
        
        while (i <= medio && j <= der) {
            if (arr.get(i).titular.compareToIgnoreCase(arr.get(j).titular) <= 0) {
                temp.add(arr.get(i));
                i++;
            } else {
                temp.add(arr.get(j));
                j++;
            }
        }
        
        while (i <= medio) {
            temp.add(arr.get(i));
            i++;
        }
        
        while (j <= der) {
            temp.add(arr.get(j));
            j++;
        }
        
        for (int k = 0; k < temp.size(); k++) {
            arr.set(izq + k, temp.get(k));
        }
    }
    public Cuenta busquedaBinaria(String numero) {
        // Primero ordenar
        ArrayList<Cuenta> ordenadas = new ArrayList<>(cuentas);
        Collections.sort(ordenadas, (a, b) -> a.numeroCuenta.compareTo(b.numeroCuenta));
        
        int resultado = busquedaBinariaRecursiva(ordenadas, numero, 0, ordenadas.size() - 1);
        
        if (resultado != -1) {
            return ordenadas.get(resultado);
        }
        return null;
    }

    private int busquedaBinariaRecursiva(ArrayList<Cuenta> arr, String numero, int izq, int der) {
        if (der >= izq) {
            int medio = izq + (der - izq) / 2;
            
            if (arr.get(medio).numeroCuenta.equals(numero))
                return medio;
            
            if (arr.get(medio).numeroCuenta.compareTo(numero) > 0)
                return busquedaBinariaRecursiva(arr, numero, izq, medio - 1);
            
            return busquedaBinariaRecursiva(arr, numero, medio + 1, der);
        }
        return -1;
    }
    public void mostrarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas");
            return;
        }
        
        System.out.println("TODAS LAS CUENTAS:");
        System.out.println("=".repeat(60));
        for (Cuenta c : cuentas) {
            if (c.activa) c.mostrar();
        }
    }

    public void consultarSaldo(String numero) {
        Cuenta cuenta = buscarCuenta(numero);
        if (cuenta == null) {
            System.out.println("Cuenta no encontrada");
            return;
        }
        System.out.println("SALDO:");
        cuenta.mostrar();
    }
    public void mostrarHistorial() {
        if (pilaHistorial.isEmpty()) {
            System.out.println("No hay transacciones");
            return;
        }
        
        System.out.println("HISTORIAL DE TRANSACCIONES:");
        System.out.println("=".repeat(60));
        
        // Copiar la pila para no modificarla
        Stack<Transaccion> temp = new Stack<>();
        temp.addAll(pilaHistorial);
        
        while (!temp.isEmpty()) {
            temp.pop().mostrar();
        }
    }
    public void mostrarUltimas(int cantidad) {
        if (pilaHistorial.isEmpty()) {
            System.out.println("No hay transacciones");
            return;
        }
        
        System.out.println("ÚLTIMAS " + cantidad + " TRANSACCIONES:");
        System.out.println("=".repeat(60));
        
        Stack<Transaccion> temp = new Stack<>();
        int count = 0;
        
        while (!pilaHistorial.isEmpty() && count < cantidad) {
            Transaccion t = pilaHistorial.pop();
            t.mostrar();
            temp.push(t);
            count++;
        }
        while (!temp.isEmpty()) {
            pilaHistorial.push(temp.pop());
        }
    }

    public void generarReporte() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay datos");
            return;
        }
        
        double total = 0;
        int activas = 0;
        
        for (Cuenta c : cuentas) {
            if (c.activa) {
                activas++;
                total += c.saldo;
            }
        }
        
        System.out.println("REPORTE:");
        System.out.println("=".repeat(40));
        System.out.println("Total cuentas: " + cuentas.size());
        System.out.println("Cuentas activas: " + activas);
        System.out.printf("Saldo total: $%.2f", total);
        System.out.printf("Saldo promedio: $%.2f", activas > 0 ? total / activas : 0);
        System.out.println("Total transacciones: " + pilaHistorial.size());
    }
}