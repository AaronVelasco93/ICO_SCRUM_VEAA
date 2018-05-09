
package ico.fes.singleton;


public class BaseDeDatosSingleton {
    
    private static BaseDeDatosSingleton _instance;

    private BaseDeDatosSingleton() {
    }
    
    public static BaseDeDatosSingleton getInstance(){
    if (_instance == null){
        _instance = new BaseDeDatosSingleton();
    }else {
        System.out.println("El objeto ya fue instancido");
    }
        return _instance;
    }
    
    public void simularConsulta(){
        System.out.println("Id. de objeto:"+this.toString());
        System.out.println("Id | Nombre | Telefono");
        System.out.println(" 1 | Juan   | 4698-8654");
        System.out.println(" 2 | Pedro  | 5698-4589");
        System.out.println(" 3 | Dario  | 1234-1256");
    }
    
}
