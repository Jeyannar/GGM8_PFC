/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Templates;

import BLL.JuegosBLL;
import Templates.ITemplate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jeyannar
 */
public class GetAllJuegosTemplate extends ITemplate {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        JuegosBLL jBll = new JuegosBLL();
        return jBll.getAllJuegos();
    }

}
