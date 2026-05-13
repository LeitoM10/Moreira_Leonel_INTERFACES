import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese monto:");
        double monto = sc.nextDouble();

        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("3. Transferencia");

        int opcion = sc.nextInt();

        Pagable pago;

        if (opcion == 1) {
            pago = new PagoEfectivo();
        } else if (opcion == 2) {
            pago = new PagoTarjeta();
        } else {
            pago = new Transferencia();
        }

        pago.procesarPago(monto);
    }
}