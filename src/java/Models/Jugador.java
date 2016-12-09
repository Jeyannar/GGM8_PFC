/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Jeyannar
 */
public class Jugador {
    private String nombreUsu;
    private String idTitulo;
    private String idPlataforma;

    /**
     * @return the nombreUsu
     */
    public String getNombreUsu() {
        return nombreUsu;
    }

    /**
     * @param nombreUsu the nombreUsu to set
     */
    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    /**
     * @return the idTitulo
     */
    public String getIdTitulo() {
        return idTitulo;
    }

    /**
     * @param idTitulo the idTitulo to set
     */
    public void setIdTitulo(String idTitulo) {
        this.idTitulo = idTitulo;
    }

    /**
     * @return the idPlataforma
     */
    public String getIdPlataforma() {
        return idPlataforma;
    }

    /**
     * @param idPlataforma the idPlataforma to set
     */
    public void setIdPlataforma(String idPlataforma) {
        this.idPlataforma = idPlataforma;
    }
    
}
