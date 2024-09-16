package designpatterns.SingletonPattern;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;

    private DatabaseConnection() {

    }

    static DatabaseConnection getLazyInstance() {
        if (databaseConnection == null) {
            synchronized (DatabaseConnection.class) {
                if (databaseConnection == null) {
                    System.out.println("db instance is null creating a new one");
                    databaseConnection = new DatabaseConnection();
                } else {
                    System.out.println("instance already present");
                }
            }
        }

        return databaseConnection;
    }
}
