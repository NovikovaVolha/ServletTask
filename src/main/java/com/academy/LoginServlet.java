package com.academy;

import com.academy.model.entity.user.User;
import com.academy.service.LoginService;
import lombok.var;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var login = req.getParameter("login");
        var password = req.getParameter("password");

        var loginService = new LoginService();

        if (loginService.checkCredential(login, password)) {
            var session = req.getSession();
            var user = new User(login, password);
            session.setAttribute("user", user);
        } else {
            req.getRequestDispatcher("/loginForm").forward(req, resp);
        }

        req.getRequestDispatcher("/output").forward(req, resp);
    }

}
