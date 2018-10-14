/**
 * Created by libanez on 14/10/2018.
 */
public class Main {
    public static void main(String[] args) {
        Bank banco = new Bank();

        banco.realizarOperaciones();
        banco.imprimirClienteYSaldo();
        banco.imprimirSaldoTotalBanco();
    }
}
