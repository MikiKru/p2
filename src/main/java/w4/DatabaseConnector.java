package w4;

public abstract class DatabaseConnector {
    public abstract void connect(String dbName, String dbUser, String dbPassword);
    public abstract void close();

    public void select(){
        System.out.println("SQL SELECT COMMAND WILL BE HERE");
    }
    public void delete(){
        System.out.println("SQL DELETE COMMAND WILL BE HERE");
    }
}
