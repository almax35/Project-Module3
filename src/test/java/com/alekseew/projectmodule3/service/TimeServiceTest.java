package com.alekseew.projectmodule3.service;

import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpSession;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TimeServiceTest {
    @Test
    void whenTimeServiceCalled_thenReturnRightMessage() throws InterruptedException {
        HttpSession session = new MockHttpSession();
        InitService.getSession(session);
        HelloService.getSessionData(session);
        Thread.sleep(3000);
        String message = TimeService.getTime(session);
        assertEquals("You play: 3 seconds", message);
    }
}
