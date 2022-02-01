import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Connection1 {

    static Connection con;

    public static Connection createc(){
        //load the driver

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String user = "root";
            String password = "mypass";
            String url = "jdbc:mysql://localhost:3307/student";

            con = DriverManager.getConnection(url,user,password);

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }
}
