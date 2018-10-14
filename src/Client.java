/**
 * Created by libanez on 14/10/2018.
 */
public class Client {

    //public , friendly, protected, private

    protected String nombre;
    private int monto;

    public Client(String nombreCliente) {
        nombre = nombreCliente;
        monto = 0;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void depositarMonto(int depositar) {
        monto = monto + depositar;
    }

    public void extraerMonto(int extraer) {
        monto = monto - extraer;
    }

    public int retornarMonto() {
        return monto;
    }

}
