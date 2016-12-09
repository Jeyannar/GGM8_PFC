/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Jeyannar
 */
public class Titulo {
    private String IdTitulo;
    private String nombreTitulo;
    private String distribuidora;
    private String genero;
    private Date fechaLanzamiento;

    /**
     * @return the IdTitulo
     */
    public String getIdTitulo() {
        return IdTitulo;
    }

    /**
     * @param IdTitulo the IdTitulo to set
     */
    public void setIdTitulo(String IdTitulo) {
        this.IdTitulo = IdTitulo;
    }

    /**
     * @return the nombreTitulo
     */
    public String getNombreTitulo() {
        return nombreTitulo;
    }

    /**
     * @param nombreTitulo the nombreTitulo to set
     */
    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    /**
     * @return the distribuidora
     */
    public String getDistribuidora() {
        return distribuidora;
    }

    /**
     * @param distribuidora the distribuidora to set
     */
    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the fechaLanzamiento
     */
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * @param fechaLanzamiento the fechaLanzamiento to set
     */
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
