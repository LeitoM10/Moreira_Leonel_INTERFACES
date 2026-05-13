public class Administrador implements Autenticable, Reportable, Gestionable {
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return usuario.equals("admin") && clave.equals("admin");
    }

    @Override
    public void generarReporte() {
        System.out.println("Generando reporte...");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Administrador gestionando sistema...");
    }
}