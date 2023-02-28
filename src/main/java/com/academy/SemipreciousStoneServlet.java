package com.academy;

import com.academy.service.SemipreciousStoneService;
import lombok.var;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/semiprecious")
public class SemipreciousStoneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var semipreciousStoneService = new SemipreciousStoneService();

        var semipreciousStones = semipreciousStoneService.getSemipreciousStones();

        req.setAttribute("semiprecious", semipreciousStones);

        req.getRequestDispatcher("/WEB-INF/jsp/semiprecious.jsp").forward(req, resp);
    }

}
