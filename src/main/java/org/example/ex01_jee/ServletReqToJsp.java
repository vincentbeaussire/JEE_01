package org.example.ex01_jee;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ServletReqToJsp", value = "servletreqtojsp")
public class ServletReqToJsp extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Une requête GET a été envoyée à /servletreqtojsp");

        response.setContentType("text/html");

        getServletContext().getRequestDispatcher("/Page.jsp").forward(request, response);

    }
}
