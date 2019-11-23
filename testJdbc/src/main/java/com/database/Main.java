package com.database;

import java.sql.*;

public class Main {

    private final static String
            URL="jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final static String USERNAME="root";
    private final static String PASSWORD="root";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
            ResultSet result;
            String query = "select * from users";
            result = statement.executeQuery(query);
            while (result.next()){
                String id = result.getString("name");
                System.out.println(id);
            }
            connection.close();
            if (connection.isClosed()) {
                System.out.println("Соединение с БД закрыто");
            }
        }
        catch (SQLException e){
            System.out.println("Не удалось установить соединение");
        }
    }
}
