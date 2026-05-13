public class Supervisor implements Autenticable, Reportable {
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return usuario.equals("supervisor") && clave.equals("1234");
    }

    @Override
    public void generarReporte() {
        System.out.println("Supervisor generando reporte...");
    }
}