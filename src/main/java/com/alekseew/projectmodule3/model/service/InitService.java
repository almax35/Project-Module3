package com.alekseew.projectmodule3.model.service;

import jakarta.servlet.http.HttpSession;

public class InitService {
    public static void getSession(HttpSession session){
        int count=-1;
        session.setAttribute("timesPlayed",count);
    }
}
