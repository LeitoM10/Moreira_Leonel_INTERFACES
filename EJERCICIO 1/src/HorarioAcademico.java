public class HorarioAcademico implements Imprimible {
    private String dia;
    private String hora;

    public HorarioAcademico(String dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    @Override
    public void imprimir() {
        System.out.println("Horario: " + dia + " a las " + hora);
    }
}