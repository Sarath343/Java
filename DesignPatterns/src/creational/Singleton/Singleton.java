package creational.Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
         }
        return instance;
    }
    public void doAction(String txt){
        System.out.println("printintg "+txt);
    }
}
