package com.database;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        DBConnect conn = new DBConnect();
        String query = "select * from users";
//        String query1 = "insert into users values(3, 'Chernov', '6der', '25')";
        try {
            Statement statement = conn.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setAge(resultSet.getInt("age"));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
