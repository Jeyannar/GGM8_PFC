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
public class Comentario {
    private String idComentario;
    private String idPost;
    private String nombreUsu;
    private String contenidoComentario_;
    private Date fechaComentario;

    /**
     * @return the idComentario
     */
    public String getIdComentario() {
        return idComentario;
    }

    /**
     * @param idComentario the idComentario to set
     */
    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    /**
     * @return the idPost
     */
    public String getIdPost() {
        return idPost;
    }

    /**
     * @param idPost the idPost to set
     */
    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }

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
     * @return the contenidoComentario_
     */
    public String getContenidoComentario_() {
        return contenidoComentario_;
    }

    /**
     * @param contenidoComentario_ the contenidoComentario_ to set
     */
    public void setContenidoComentario_(String contenidoComentario_) {
        this.contenidoComentario_ = contenidoComentario_;
    }

    /**
     * @return the fechaComentario
     */
    public Date getFechaComentario() {
        return fechaComentario;
    }

    /**
     * @param fechaComentario the fechaComentario to set
     */
    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
    
}
