package org.example.webjava.controller;

import org.example.webjava.bean.Journaliste;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String pseudo = req.getParameter("pseudo");
        req.setAttribute("pseudo_attribute_name", pseudo);

        Journaliste journaliste = new Journaliste();
        String jName = "Reporter 1";
        journaliste.setName(jName);
        journaliste.setId(1);
        req.setAttribute("journaliste", journaliste);

        final ServletContext servletContext = req.getServletContext();
        final RequestDispatcher requestDispatcher;

        if (jName.equals(pseudo)) {
            requestDispatcher = servletContext.getRequestDispatcher("/WEB-INF/jsp/dashboard.jsp");
        } else {
            requestDispatcher = servletContext.getRequestDispatcher("/WEB-INF/jsp/echec.jsp");

        }

        requestDispatcher.forward(req, resp);

        //PrintWriter out = resp.getWriter();
        //out.println("<h1>" + pseudo + "</h1>");

    }
}
