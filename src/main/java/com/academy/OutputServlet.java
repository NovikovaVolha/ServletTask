package com.academy;

import com.academy.model.entity.user.User;
import lombok.var;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/output")
public class OutputServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var session = req.getSession();

        var user = (User) session.getAttribute("user");

        var login = user.getLogin();
        var password = user.getPassword();

        if ("admin".equals(login) && "admin".equals(password)) {
            resp.sendRedirect("/precious");
        } else if ("user".equals(login) && "user".equals(password)) {
            resp.sendRedirect("/semiprecious");
        }
    }

}
