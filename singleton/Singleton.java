package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Singleton
{
    private static Singleton instance=null;
    private static final String URL="jdbc:postgresql://localhost:5432/auth";
    private static final String USER="postgres";
    private static final String PASSWORD="admin";
    private Connection connection;
    private Singleton() throws SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            this.connection=DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connection reussie.....");
        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex);
        }
        
    }


    public static Singleton getInstance() throws SQLException{
        if (instance==null || instance.getConnection().isClosed()) {
            instance= new Singleton();
        }
        return instance;
    }

    public Connection getConnection()
    {
        return connection;
    }

}