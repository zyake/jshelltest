/classpath postgresql-42.2.5.jar
Class.forName("org.postgresql.Driver")
import java.sql.*
Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.10.201/postgres", "hoge", "myPassword")
Statement stmt = conn.createStatement()
ResultSet rs = stmt.executeQuery("SELECT 1")
while (rs.next()) { 
 System.out.println(rs.getString(1)); 
}
/exit 
