package com.tunitx.servlets;

import java.io.*;
import java.util.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
    private static final List<User> users = new ArrayList<>();

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        for (User user : users) {
            if (user.email.equals(email)) {
                res.setStatus(409); // Conflict
                out.write("User already exists. Please log in.");
                return;
            }
        }

        users.add(new User(email, password));
        HttpSession session = req.getSession();
        session.setAttribute("email", email);

        res.setStatus(200);
        out.write("Signup successful!");
    }

    public static List<User> getUsers() {
        return users;
    }

    static class User {
        String email, password;
        User(String e, String p) { email = e; password = p; }
    }
}
