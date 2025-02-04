package creational.FactoryMethod;

public class OracleDB implements Database {
    public void connect(){
        System.out.println("connecting to oracle DB");
    }
}
