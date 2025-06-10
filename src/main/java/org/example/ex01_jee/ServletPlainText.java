package org.example.ex01_jee;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "servletPlaintText", value = "/servletplaintext")
public class ServletPlainText extends HttpServlet {

    private String text;

    @Override
    public void init() throws ServletException {
        text = "Je suis James Bond";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Une requête GET a été envoyée à /servletPlaintText");
        response.setContentType("text/html");
    }
}
