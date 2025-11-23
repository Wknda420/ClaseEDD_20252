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
        
    }
}