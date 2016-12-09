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
public class Post {
    private String idPost;
    private String nombreUsu;
    private String idTitulo;
    private String postTitulo;
    private String postContent;
    private Date fechaPost;

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
     * @return the postTitulo
     */
    public String getPostTitulo() {
        return postTitulo;
    }

    /**
     * @param postTitulo the postTitulo to set
     */
    public void setPostTitulo(String postTitulo) {
        this.postTitulo = postTitulo;
    }

    /**
     * @return the postContent
     */
    public String getPostContent() {
        return postContent;
    }

    /**
     * @param postContent the postContent to set
     */
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    /**
     * @return the fechaPost
     */
    public Date getFechaPost() {
        return fechaPost;
    }

    /**
     * @param fechaPost the fechaPost to set
     */
    public void setFechaPost(Date fechaPost) {
        this.fechaPost = fechaPost;
    }
    
}
