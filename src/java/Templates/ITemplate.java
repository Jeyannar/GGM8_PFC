/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Templates;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jeyannar
 */
public abstract class ITemplate {

    public void config(HttpServletRequest request, HttpServletResponse response) throws Exception {

    }

    public abstract String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
