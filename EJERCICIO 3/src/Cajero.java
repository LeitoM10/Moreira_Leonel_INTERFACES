public class Cajero extends UsuarioBase implements Gestionable {

    public Cajero() {
        super("cajero", "123");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Cajero gestionando datos...");
    }
}