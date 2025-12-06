package singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Client {
    public static void main(String[] args) {
        try {
            Singleton pg = Singleton.getInstance();
            Connection conn = pg.getConnection();

            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
