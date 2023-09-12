package com.alekseew.projectmodule3.controller;

import com.alekseew.projectmodule3.model.service.LanguageService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="language", value = "/language")
public class LanguageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String language=req.getParameter("variant");
        HttpSession session=req.getSession();
        String message=LanguageService.getMessage(language);
        session.setAttribute("message", message);
        RequestDispatcher dispatcher=session.getServletContext().getRequestDispatcher("/view/language.jsp");
        dispatcher.forward(req, resp);
    }
}
