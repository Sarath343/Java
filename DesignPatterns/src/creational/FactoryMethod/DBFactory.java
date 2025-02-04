package creational.FactoryMethod;

public class DBFactory {
    public static Database getDataBase(String name){
        if(name.equals("oracle")){
            return new OracleDB();
        }
        else if(name.equals("mysql")){
            return new MySQLDB();

        }
        return null;
    }
}
