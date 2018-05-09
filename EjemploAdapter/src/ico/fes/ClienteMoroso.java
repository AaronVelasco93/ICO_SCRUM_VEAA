
package ico.fes;


public class ClienteMoroso {
    
    public void cobrarCuotaMensual(float cuota, float multa){
        System.out.println(" Se encuentra trasado el pago");
        System.out.println("Se le impone una multa de: "+multa+"%");
        System.out.println("Cuota: $"+cuota);
        System.out.println("Multa: $"+cuota*(multa/100));
        System.out.println("Total: $"+(cuota+cuota*(multa/100)));
    }
    
}
