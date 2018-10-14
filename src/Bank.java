/**
 * Created by libanez on 14/10/2018.
 */
import java.util.Scanner;


public class Bank {

    private final static String extraer = "extraer";
    private final static String depositar = "depositar";


    private Scanner teclado;
    private Client cliente1;
    private Client cliente2;
    private Client cliente3;
    private Client cliente4;
    private int saldoBanco;

    public Bank() {
        teclado = new Scanner(System.in);
        cliente1 = new Client("pedro");
        cliente2 = new Client("iris");
        cliente3 = new Client("amparo");
        cliente4 = new ClienteEmpresa("Manolo", "SEUR");

    }

    public void realizarOperaciones() {
        String nombre;
        String queRealizar;

        int finalizar = 1;
        while (finalizar != 0) {
            int cantidad = 0;
            System.out.println("Introduce el nombre del cliente");
            nombre = teclado.next();
            if (nombre.equals(cliente1.toString())) {
                System.out.println("Introduce la operacion a realizar, depositar o extraer");
                queRealizar = teclado.next();
                if (queRealizar.equals(depositar)) {
                    System.out.println("Introduce la cantidad a depositar: ");
                    cantidad = teclado.nextInt();
                    cliente1.depositarMonto(cantidad);
                }
                if (queRealizar.equals(extraer)) {
                    System.out.println("Introduce la cantidad a extraer: ");
                    cantidad = teclado.nextInt();
                    cliente1.extraerMonto(cantidad);
                }

            } else if (nombre.equals(cliente2.toString())) {
                System.out.println("Introduce la operacion a realizar, depositar o extraer");
                queRealizar = teclado.next();
                if (queRealizar.equals(depositar)) {
                    System.out.println("Introduce la cantidad a depositar: ");
                    cantidad = teclado.nextInt();
                    cliente2.depositarMonto(cantidad);
                }
                if (queRealizar.equals(extraer)) {
                    System.out.println("Introduce la cantidad a extraer: ");
                    cantidad = teclado.nextInt();
                    cliente2.extraerMonto(cantidad);
                }

            } else if (nombre.equals(cliente3.toString())) {
                System.out.println("Introduce la operacion a realizar, depositar o extraer");
                queRealizar = teclado.next();
                if (queRealizar.equals(depositar)) {
                    System.out.println("Introduce la cantidad a depositar: ");
                    cantidad = teclado.nextInt();
                    cliente3.depositarMonto(cantidad);
                }
                if (queRealizar.equals(extraer)) {
                    System.out.println("Introduce la cantidad a extraer: ");
                    cantidad = teclado.nextInt();
                    cliente3.extraerMonto(cantidad);
                }
            } else if (nombre.equals(cliente4.toString())) {
                System.out.println("Introduce la operacion a realizar, depositar o extraer");
                queRealizar = teclado.next();
                if (queRealizar.equals(depositar)) {
                    System.out.println("Introduce la cantidad a depositar: ");
                    cantidad = teclado.nextInt();
                    cliente4.depositarMonto(cantidad);
                }
                if (queRealizar.equals(extraer)) {
                    System.out.println("Introduce la cantidad a extraer: ");
                    cantidad = teclado.nextInt();
                    cliente4.extraerMonto(cantidad);
                }
            }
            System.out.println("Deseas realizar otra operacion pulsa 1 si no pulsa 0.");
            finalizar = teclado.nextInt();
        }
    }

    public void imprimirClienteYSaldo() {
        System.out.println("El nombre del cliente es: " + cliente1.toString() +
                " y su saldo es de:\t\t" + cliente1.retornarMonto() + "\n" +
                "El nombre del cliente es: " + cliente2.toString() +
                " y su saldo es de:\t\t" + cliente2.retornarMonto() + "\n" +
                "El nombre del cliente es: " + cliente3.toString() +
                " y su saldo es de:\t\t" + cliente3.retornarMonto()+ "\n" +
                "El nombre del cliente es: " + cliente4.toString() +
                " y su saldo es de:\t\t" + cliente4.retornarMonto());
    }

    public void imprimirSaldoTotalBanco() {
        saldoBanco = (cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto() + cliente4.retornarMonto());
        System.out.println("El saldo total del banco es de: " + saldoBanco);
    }
}
