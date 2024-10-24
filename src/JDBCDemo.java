import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args){
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
         */

        try {

            String url="jdbc:postgresql://localhost:5432/JDBCDemo";
            String username="postgres";
            String password="0000";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);

            System.out.println("Connection Established");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
