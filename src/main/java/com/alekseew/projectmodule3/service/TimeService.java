package com.alekseew.projectmodule3.service;

import jakarta.servlet.http.HttpSession;

import java.util.Date;

public class TimeService {
    public static String getTime(HttpSession session) {
        Date date = (Date) session.getAttribute("time");
        Long start = date.getTime();
        Long lose = new Date().getTime();
        String result = "You play: " + (lose - start) / 1000 + " seconds";
        return result;
    }
}
