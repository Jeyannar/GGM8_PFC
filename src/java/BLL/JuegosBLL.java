/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.DBConnection;
import DAO.JuegosDAO;
import Models.Juego;
import com.google.gson.Gson;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeyannar
 */
public class JuegosBLL {

    Gson gson = new Gson();

    public String getAllJuegos() {

        String json = "";
        DBConnection dbConnection = new DBConnection();
        try {
            Connection con = dbConnection.openConnection();
            JuegosDAO jDao = new JuegosDAO();

            List<Juego> listJuegos = jDao.getAllJuegos(con);
            
            json = gson.toJson(listJuegos);
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;
    }
    
    public String getComentariosByIdPost() {

        String json = "";
        DBConnection dbConnection = new DBConnection();
        try {
            Connection con = dbConnection.openConnection();
            JuegosDAO jDao = new JuegosDAO();

            List<Juego> listJuegos = jDao.getAllJuegos(con);
            
            json = gson.toJson(listJuegos);
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;
    }

}
