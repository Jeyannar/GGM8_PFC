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
public class Plataforma {
    private String idPlataforma;
    private String nombrePlataforma;
    private String distribuidora;
    private String generacion;
    private String sitioWeb;
    private String fechaLanzamiento;

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

    /**
     * @return the nombrePlataforma
     */
    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    /**
     * @param nombrePlataforma the nombrePlataforma to set
     */
    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
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
     * @return the generacion
     */
    public String getGeneracion() {
        return generacion;
    }

    /**
     * @param generacion the generacion to set
     */
    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    /**
     * @return the sitioWeb
     */
    public String getSitioWeb() {
        return sitioWeb;
    }

    /**
     * @param sitioWeb the sitioWeb to set
     */
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    /**
     * @return the fechaLanzamiento
     */
    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * @param fechaLanzamiento the fechaLanzamiento to set
     */
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
