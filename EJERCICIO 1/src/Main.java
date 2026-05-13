public class Main {
    public static void main(String[] args) {
        Certificado c = new Certificado("Leonel", "Software");
        ActaNotas a = new ActaNotas("POO", 9.5);
        HorarioAcademico h = new HorarioAcademico("Lunes", "08:00");

        c.imprimir();
        a.imprimir();
        h.imprimir();
    }
}