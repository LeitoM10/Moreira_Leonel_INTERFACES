public class PagoTarjeta implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            double total = monto + (monto * 0.05);
            System.out.println("Pago con tarjeta: $" + total);
        } else {
            System.out.println("Monto inválido");
        }
    }
}