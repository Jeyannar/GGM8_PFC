/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Juego;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeyannar
 */
public class JuegosDAO {

    public List<Juego> getAllJuegos(Connection connection) throws SQLException {
        final String sql = "Select * From juegos";
        List<Juego> allJuegos = new ArrayList<>();
        ResultSet result = connection.prepareStatement(sql).executeQuery();

        while (result.next()) {
            Juego juego = new Juego();
            juego.setIdTitulo(result.getString(1));
            juego.setIdPlataforma(result.getString(2));
            allJuegos.add(juego);
        }
        return allJuegos;
    }
}
