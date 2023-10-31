import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static void main(String... x) {
        try {
            Connection connection = DriverManager
                    .getConnection(url:"jdbc:mysql://localhost:3306/MOCOCA?user=root&password=Snoop9093");

            System.out.println("Recuperei a conexão");

            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


