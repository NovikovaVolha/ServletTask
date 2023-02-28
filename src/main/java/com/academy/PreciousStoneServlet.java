package com.academy;

import com.academy.service.PreciousStoneService;
import com.academy.service.SemipreciousStoneService;
import lombok.var;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/precious")
public class PreciousStoneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var preciousStoneService = new PreciousStoneService();

        var preciousStones = preciousStoneService.getPreciousStones();

        req.setAttribute("precious", preciousStones);

        req.getRequestDispatcher("/WEB-INF/jsp/precious.jsp").forward(req, resp);
    }

}
