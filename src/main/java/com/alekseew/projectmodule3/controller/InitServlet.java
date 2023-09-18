package com.alekseew.projectmodule3.controller;

import com.alekseew.projectmodule3.model.service.InitService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="init",value = "/init")
public class InitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session= req.getSession();
        InitService.getSession(session);
        RequestDispatcher dispatcher=session.getServletContext().getRequestDispatcher("/hello");
        dispatcher.forward(req, resp);
    }
}
