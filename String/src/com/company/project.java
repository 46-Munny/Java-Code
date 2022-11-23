package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class project {
    void insertData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/juniv";
            String userName = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO student (id, name) values ('104', 'Mamun')");
            //statement.executeUpdate("INSERT INTO student values (3,3255,325,183654,James Cameroon, 0155, email@email.com)");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
