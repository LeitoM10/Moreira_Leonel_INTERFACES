import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Usuario:");
        String user = sc.nextLine();

        System.out.println("Clave:");
        String pass = sc.nextLine();

        Autenticable persona = null;

        if (user.equals("cajero")) {
            persona = new Cajero();
        } else if (user.equals("admin")) {
            persona = new Administrador();
        } else if (user.equals("supervisor")) {
            persona = new Supervisor();
        }

        if (persona != null && persona.iniciarSesion(user, pass)) {
            System.out.println("Acceso permitido");

            if (persona instanceof Administrador) {
                ((Administrador) persona).gestionarDatos();
                ((Administrador) persona).generarReporte();
            } else if (persona instanceof Cajero) {
                ((Cajero) persona).gestionarDatos();
            } else if (persona instanceof Supervisor) {
                ((Supervisor) persona).generarReporte();
            }

        } else {
            System.out.println("Acceso denegado");
        }
    }
}