package com.tunitx.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/users")
public class ViewUsersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	System.out.println("HIIii");
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("email") == null) {
            res.setStatus(403);
            return;
        }

        List<String> emails = new ArrayList<>();
        for (SignupServlet.User user : SignupServlet.getUsers()) {
            emails.add(user.email);
        }

        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < emails.size(); i++) {
            json.append("\"").append(emails.get(i)).append("\"");
            if (i < emails.size() - 1) {
                json.append(",");
            }
        }
        json.append("]");

        res.setContentType("application/json");
        res.getWriter().write(json.toString());
    }
}
