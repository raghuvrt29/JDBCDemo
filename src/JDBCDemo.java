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

            String url = "jdbc:postgresql://localhost:5432/JDBCDemo";
            String username = "postgres";
            String password = "0000";
            String sql = "select * from students;";

            Connection conn = DriverManager.getConnection(url,username,password);

            System.out.println("Connection Established");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getInt(1) + " - ");
                System.out.print(rs.getString(2) + " - ");
                System.out.println(rs.getInt(3));

            }

            conn.close();
            System.out.println("Connection Closed");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
