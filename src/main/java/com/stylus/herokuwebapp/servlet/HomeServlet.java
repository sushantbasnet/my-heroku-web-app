/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stylus.herokuwebapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Sushant Singh Basnet | Stylus Technology
 */
@WebServlet(name="homeServlet",urlPatterns = {"/","/home"})
public class HomeServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name", "Sushant Singh Basnet");
        request.getRequestDispatcher("WEB-INF/views/home/index.jsp").forward(request, response);
    }
    
    
    
    
}
