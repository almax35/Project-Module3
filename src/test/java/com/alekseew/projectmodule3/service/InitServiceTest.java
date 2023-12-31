package com.alekseew.projectmodule3.service;

import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpSession;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitServiceTest {
    @Test
    void whenInitServiceCalled_thenReturnSessionWithParam() {
        HttpSession session = new MockHttpSession();
        InitService.getSession(session);
        Integer count = (Integer) session.getAttribute("timesPlayed");
        assertEquals(-1, count);
    }
}
