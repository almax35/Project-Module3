package com.alekseew.projectmodule3.model.service;


import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpSession;


import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceTest {

    @Test
    void whenHelloServiceCalled_thenReturnSessionWithParams() {
        HttpSession session = new MockHttpSession();
        InitService.getSession(session);
        HelloService.getSessionData(session);
        Integer count=(Integer)session.getAttribute("timesPlayed");
        Date date=(Date)session.getAttribute("time");
        assertAll(
                () -> assertEquals(count,0),
                () -> assertNotNull(date)
        );
    }
}
