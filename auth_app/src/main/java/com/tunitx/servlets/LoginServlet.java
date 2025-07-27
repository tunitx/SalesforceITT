package com.tunitx.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        for (SignupServlet.User user : SignupServlet.getUsers()) {
            if (user.email.equals(email)) {
                if (user.password.equals(password)) {
                    HttpSession session = req.getSession();
                    session.setAttribute("email", email);
                    res.setStatus(200);
                    out.write("Login successful!");
                } else {
                    res.setStatus(403);
                    out.write("Incorrect password!");
                }
                return;
            }
        }

        res.setStatus(404);
        out.write("User not found. Please sign up.");
    }
}
