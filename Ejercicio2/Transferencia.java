public class Transferencia implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double total = monto + (monto * 0.02);
            System.out.println("Transferencia realizada: $" + total);
        } else {
            System.out.println("Monto inválido");
        }
    }
}