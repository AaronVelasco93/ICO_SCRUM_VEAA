package ico.fes.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        BaseDeDatosSingleton db1 = BaseDeDatosSingleton.getInstance();
        db1.simularConsulta();
        db1.simularConsulta();
        db1.simularConsulta();
        BaseDeDatosSingleton db3 = BaseDeDatosSingleton.getInstance();
        db3.simularConsulta();
        BaseDeDatosSingleton db2 = BaseDeDatosSingleton.getInstance();
        db2.simularConsulta();
        BaseDeDatosSingleton db4 = BaseDeDatosSingleton.getInstance();
        db4.simularConsulta();
    }

}
