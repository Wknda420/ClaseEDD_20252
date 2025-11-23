package Momento3;

public class Cuenta {
    String numeroCuenta;
    String titular;
    double saldo;
    String tipoCuenta;
    boolean activa;

    public Cuenta(String numeroCuenta, String titular, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta =numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
        this.activa = true;
    }

    public void mostrar() {
        System.out.printf("Cuenta: %s | Titular: %s | Saldo: $%.2f | Tipo: %s", numeroCuenta,titular, saldo, tipoCuenta);
    }
}
