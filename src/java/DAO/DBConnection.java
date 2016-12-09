/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Jeyannar
 */
public class DBConnection {

    public Connection openConnection() throws ClassNotFoundException, SQLException {

        final String dbServer = "jesus5680.cloudapp.net/GGM8";

        final String dbUser = "jesus";

        final String dbPassword = "jesus";

        Connection connection;

        Class.forName("com.mysql.jdbc.Driver");

        connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + dbServer + "?user=" + dbUser + "&password=" + dbPassword);

        return connection;

    }

    public void closeConnection(Connection connection) throws SQLException {

        if (connection == null) {
            System.out.println("The connection was already closed");
        } else {
            connection.close();
        }
    }

}
