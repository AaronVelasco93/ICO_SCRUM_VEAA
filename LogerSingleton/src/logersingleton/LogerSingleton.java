/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logersingleton;

/**
 *
 * @author S1PC1
 */
public class LogerSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Logger miloger_1= Logger.getIntance();
        Logger miloger_2=Logger.getIntance();
        
        miloger_1.setValue("un mensaje");
        
        System.out.println(miloger_2.getValue());//el mismo valor por que es la misma instancia
        //permite tener la misma instancia en un objeto
        
        
        miloger_1.palabraloger("Aaron es mi nombre");
        // TODO code application logic here
    }
    
}
