package creational.FactoryMethod;

public class Connecting {
    public static void main(String[] args) {
       Database db =  DBFactory.getDataBase("mysql") ;
       db.connect();
    }

   

}
