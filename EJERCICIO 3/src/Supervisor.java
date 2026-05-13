public class Supervisor extends UsuarioBase implements Reportable {

    public Supervisor() {
        super("supervisor", "1234");
    }

    @Override
    public void generarReporte() {
        System.out.println("Supervisor generando reporte...");
    }
}