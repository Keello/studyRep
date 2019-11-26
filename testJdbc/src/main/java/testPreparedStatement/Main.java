package testPreparedStatement;

import java.sql.*;
import java.util.Calendar;


public class Main {

    private static final String insertQUERY = "INSERT INTO dish VALUES(?,?,?,?,?,?,?)";
    private static final String getData = "SELECT * FROM dish";

    public static void main(String[] args) {
        DBConnect connect = new DBConnect();
        PreparedStatement preparedStatement;
        //InsertData insertData = new InsertData(insertQUERY);

        try {
            preparedStatement = connect.getConnection().prepareStatement(getData);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()){
                System.out.println(result.getString("description"));
            }
            preparedStatement.close();
            connect.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
