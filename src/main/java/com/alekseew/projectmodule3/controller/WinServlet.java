package com.alekseew.projectmodule3.controller;

import com.alekseew.projectmodule3.model.service.TimeService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="win", value = "/win")
public class WinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result= TimeService.getTime(req);
        HttpSession session=req.getSession();
        session.setAttribute("result",result);
        RequestDispatcher dispatcher=session.getServletContext().getRequestDispatcher("/view/win.jsp");
        dispatcher.forward(req, resp);
    }
}
