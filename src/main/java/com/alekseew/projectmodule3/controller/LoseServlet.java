package com.alekseew.projectmodule3.controller;

import com.alekseew.projectmodule3.service.TimeService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "lose", value = "/lose")
public class LoseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String result = TimeService.getTime(session);
        session.setAttribute("result", result);
        RequestDispatcher dispatcher = session.getServletContext().getRequestDispatcher("/view/lose.jsp");
        dispatcher.forward(req, resp);
    }
}
