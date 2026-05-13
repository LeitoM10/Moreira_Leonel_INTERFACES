public class ActaNotas implements Imprimible {
    private String materia;
    private double nota;

    public ActaNotas(String materia, double nota) {
        this.materia = materia;
        this.nota = nota;
    }

    @Override
    public void imprimir() {
        System.out.println("Acta de la materia " + materia + " con nota: " + nota);
    }
}