/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.cb8.springproject2;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.afdemp.cb8.springproject2.entities.UserLogin;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author George.Pasparakis
 */
public class Login extends SimpleFormController {
    
    public Login() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(UserLogin.class);
        setCommandName("userlogin");
        setSuccessView("successlogin");
        setFormView("login");
    }
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        UserLogin userlogin = (UserLogin)command;
        ModelAndView mv = new ModelAndView(getSuccessView(),"user",userlogin);
        return mv;
    }
    
}
