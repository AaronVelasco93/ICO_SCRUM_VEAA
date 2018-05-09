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
public class Logger {

    private static Logger log;
    private String value;
    private Logger() {
    }
  

    public static synchronized Logger getIntance() {
        if (log == null) {
            log = new Logger();

        }
        return log;
    }

    public void palabraloger(String palabra){
    
        System.out.println("este es una palabra ->"+palabra);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
