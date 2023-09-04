package com.alekseew.projectmodule3.model.service;

import com.alekseew.projectmodule3.model.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.util.Date;

public class HelloService  {
    public HttpSession getSessionData(HttpServletRequest req){
        User user = new User(req);
        HttpSession session=req.getSession();
        session.setAttribute("ip",user.getIp());
        Date time=new Date(session.getCreationTime());
        session.setAttribute("time", time);
        return session;
    }
}