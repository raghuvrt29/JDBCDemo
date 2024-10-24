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

            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");
            Statement st = conn.createStatement();

//            // Executing Select Query
//            String sql = "select * from students;";
//            ResultSet rs = st.executeQuery(sql);
//            while(rs.next()) {
//                System.out.print(rs.getInt(1) + " - ");
//                System.out.print(rs.getString(2) + " - ");
//                System.out.println(rs.getInt(3));
//            }

//            // Executing Insert Query
//            String sql = "insert into students values(5,'Srinivas Chavali',23)";
//            boolean status = st.execute(sql);
//            System.out.println("Status: " + status);

//            //Executing Update Query
//            String sql = "update students set name='Srinivas Chodisetti' where id=5";
//            int num = st.executeUpdate(sql);
//            System.out.println("Rows effected: "+num);

            //Executing Delete Query
            String sql = "delete from students where id = 5";
            st.execute(sql);

            conn.close();
            System.out.println("Connection Closed");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
