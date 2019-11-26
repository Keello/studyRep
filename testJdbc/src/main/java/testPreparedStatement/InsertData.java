package testPreparedStatement;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class InsertData {

    public InsertData(String insertQUERY){
        DBConnect connect = new DBConnect();
        try {
            PreparedStatement preparedStatement = connect.getConnection().prepareStatement(insertQUERY);
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "second title");
            preparedStatement.setString(3, "this is second dish and it is best dish");
            preparedStatement.setDouble(4, 0.8);
            preparedStatement.setInt(5,1);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setString(7, "link to icon for second dish");

            preparedStatement.execute();
            preparedStatement.close();
            connect.getConnection().close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
