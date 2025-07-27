package com.tunitx.servlets;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/session-info")
public class SessionInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession(false);
        res.setContentType("text/plain");

        if (session == null || session.getAttribute("email") == null) {
            res.setStatus(401); // Unauthorized
            res.getWriter().write("Session expired");
            return;
        }

        String email = (String) session.getAttribute("email");
        res.setStatus(200);
        res.getWriter().write(email);
    }
}
