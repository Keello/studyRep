package testPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private final String URL="jdbc:postgresql://localhost:5432/mydbtest";
    private final String USERNAME="postgres";
    private final String PASSWORD="root";

    private Connection connection;

    public DBConnect(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
