/**
 * Created by libanez on 14/10/2018.
 */
public class ClienteEmpresa extends Client{

    private String nombreEmpresa;

    public ClienteEmpresa(String nombreCliente, String nombreEmpresa) {
        super(nombreCliente);
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return nombreEmpresa;
    }
}
