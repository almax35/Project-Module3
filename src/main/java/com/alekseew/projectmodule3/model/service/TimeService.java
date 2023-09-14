package com.alekseew.projectmodule3.model.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.util.Date;

public class TimeService {
    public static String getTime(HttpServletRequest req){
        HttpSession session=req.getSession();
        Date date=(Date)session.getAttribute("time");
        Long start=date.getTime();
        Long lose=new Date().getTime();
        String result="You play: "+(lose-start)/1000+" seconds";
        return result;
    }
}
