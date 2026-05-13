public class Certificado implements Imprimible {
    private String nombre;
    private String carrera;

    public Certificado(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    @Override
    public void imprimir() {
        System.out.println("Certificado de " + nombre + " en la carrera de " + carrera);
    }
}