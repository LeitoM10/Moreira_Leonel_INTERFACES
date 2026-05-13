public abstract class UsuarioBase implements Autenticable {
    protected String usuario;
    protected String clave;

    public UsuarioBase(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String user, String pass) {
        return this.usuario.equals(user) && this.clave.equals(pass);
    }
}