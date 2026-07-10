package com.tap;

import com.tap.DAO.UserDAO;
import com.tap.DAOimp.UserDAOImpl;
import com.tap.model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name     = req.getParameter("name");
        String email    = req.getParameter("email");
        String password = req.getParameter("password");
        String phone = req.getParameter("ph_num");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);

        UserDAO dao = new UserDAOImpl();
        boolean success = dao.registerUser(user);

        if (success) {
            res.sendRedirect("success.html");
        } else {
            res.sendRedirect("register.html?error=1");
        }
    }
}