package ico.fes;

public class ClientePremium {

    public void cobrarCuotaMensual(float cuota, float descuento) {
        System.out.println("POr ser puntal durante un año,"
                + " tiene un descuento de: " + descuento + "%");
        System.out.println("Cuota: $" + cuota);
        System.out.println("Descuento: $" + cuota * (descuento / 100));
        System.out.println("Total: $" + (cuota - cuota * (descuento / 100)));
    }
}
