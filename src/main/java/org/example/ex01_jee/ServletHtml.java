package org.example.ex01_jee;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletHtml", value = "/servlethtml")
public class ServletHtml extends HttpServlet {

    private String html;

    @Override
    public void init(ServletConfig config) throws ServletException {
        html = "James Bond";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Une requête GET a été envoyée à /servlethtml");
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + html + "</h1>");
        writer.println("</body></html>");
    }
}
