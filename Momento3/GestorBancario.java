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
}