package com.alekseew.projectmodule3.model.entity;
import jakarta.servlet.http.HttpServletRequest;

public class User {
    private String ip;

    public User(HttpServletRequest req) {
        this.ip = req.getRemoteAddr();
    }
    public String getIp() {
        return ip;
    }
}
