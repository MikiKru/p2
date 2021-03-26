package w4;

public class MySQLConnector extends DatabaseConnector {
    @Override
    public void connect(String dbName, String dbUser, String dbPassword) {
        if(dbUser.equals("admin") && dbPassword.equals("admin")) {
            System.out.println("Connected");
            System.out.println("DB name: " + dbName);
            System.out.println("DB user: " + dbUser);
        } else {
            System.out.println("Connection failed!");
        }
    }
    @Override
    public void close() {
        System.out.println("Connection is closed!");
    }

    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new MySQLConnector();
        databaseConnector.connect("test", "admin", "admin");
        databaseConnector.select();
        databaseConnector.delete();
        databaseConnector.close();

    }
}
