package org.example;

import java.sql.*;

public class DbConnection {
    public static void criaTabelaPssoa() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Db_project01", "root", "root");

            int statement = connection.prepareStatement(
                    "CREATE TABLE pessoa(nome VARCHAR(50))").executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
