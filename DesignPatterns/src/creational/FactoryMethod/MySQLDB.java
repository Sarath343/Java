package creational.FactoryMethod;

public class MySQLDB implements Database {
    public void connect (){
        System.out.println("connects to mySQL DB");
    }
}
