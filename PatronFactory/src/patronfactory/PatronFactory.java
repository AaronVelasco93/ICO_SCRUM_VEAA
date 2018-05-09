/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactory;

/**
 *
 * @author S1PC1
 */
public class PatronFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Factura miFactura = FactoryFacturas.getFactura("iva");
        
        miFactura.setId(1);
        miFactura.setImporte(100);
        System.out.println(miFactura.getImporteIva());
    }
    
}
