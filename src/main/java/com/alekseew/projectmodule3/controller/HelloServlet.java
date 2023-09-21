package com.alekseew.projectmodule3.controller;

import com.alekseew.projectmodule3.service.HelloService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "hello", value = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        HelloService.getSessionData(session);
        //Не было возможности поместить добавление user ip  в service
        session.setAttribute("user", req.getRemoteAddr());
        RequestDispatcher dispatcher = session.getServletContext().getRequestDispatcher("/view/hello-page.jsp");
        dispatcher.forward(req, resp);
    }
}
