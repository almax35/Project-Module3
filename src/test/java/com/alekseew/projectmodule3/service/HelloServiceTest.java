package com.alekseew.projectmodule3.service;


import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpSession;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceTest {

    @Test
    void whenHelloServiceCalled_thenReturnSessionWithParams() {
        HttpSession session = new MockHttpSession();
        InitService.getSession(session);
        HelloService.getSessionData(session);
        Integer count = (Integer) session.getAttribute("timesPlayed");
        Date date = (Date) session.getAttribute("time");
        assertAll(
                () -> assertEquals(count, 0),
                () -> assertNotNull(date)
        );
    }
    @Test
    void whenHelloServiceCalledAgain_thenIncrementCount(){
        HttpSession session = new MockHttpSession();
        InitService.getSession(session);
        HelloService.getSessionData(session);
        HelloService.getSessionData(session);
        Integer count1 = (Integer) session.getAttribute("timesPlayed");
        HelloService.getSessionData(session);
        Integer count2 = (Integer) session.getAttribute("timesPlayed");
        assertAll(
                () -> assertEquals(count1, 1),
                () -> assertEquals(count2, 2)
        );

    }
}
