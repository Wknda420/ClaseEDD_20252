package Momento3;

public class Transaccion {
    String tipo;
    String cuentaOrigen;
    String cuentaDestino;
    double monto;

    public Transaccion(String tipo, String cuentaOrigen,String cuentaDestino, double monto) {
        this.tipo = tipo;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;

    }
    public void mostrar() {
        System.out.printf("%s | Monto: $%.2f | Origen: %s | Destino: %s\n", tipo, monto, cuentaOrigen, cuentaDestino != null? cuentaDestino: "N/A");
    }
}
