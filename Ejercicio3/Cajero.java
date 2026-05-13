public class Cajero implements Autenticable, Gestionable {
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return usuario.equals("cajero") && clave.equals("123");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Cajero gestionando datos...");
    }
}