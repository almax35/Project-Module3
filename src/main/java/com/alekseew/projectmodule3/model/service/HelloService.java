package com.alekseew.projectmodule3.model.service;

import jakarta.servlet.http.HttpSession;

import java.util.Date;

public class HelloService {
    public static void getSessionData(HttpSession session) {
        Integer count = (Integer) session.getAttribute("timesPlayed");
        count++;
        session.setAttribute("timesPlayed", count);
        Date time = new Date();
        session.setAttribute("time", time);
    }

}