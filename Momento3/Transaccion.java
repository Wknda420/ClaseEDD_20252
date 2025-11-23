package Momento3;

public class Transaccion {
    String tipo;
    String cuentaOrigen;
    String cuentaDestino;
    double monto;

    String nombreOrigen;
    String nombreDestino;

    public Transaccion(String tipo, String cuentaOrigen,String cuentaDestino, double monto) {
        this.tipo = tipo;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
        this.nombreOrigen = "";
        this.nombreDestino = "";

    }
    public void mostrar() {
        if (tipo.equals("TRANSFERENCIA")) {
            System.out.printf("%s | Monto: $%.2f | Origen: %s (%s) | Destino: %s (%s)",
                tipo, monto, cuentaOrigen, nombreOrigen, cuentaDestino, nombreDestino);
        } else if (tipo.equals("DEPOSITO")) {
            System.out.printf("%s | Monto: $%.2f | Cuenta: %s (%s)",
                tipo, monto, cuentaOrigen, nombreOrigen);
        } else { // RETIRO
            System.out.printf("%s | Monto: $%.2f | Cuenta: %s (%s)",
                tipo, monto, cuentaOrigen, nombreOrigen);
        }
    }
}