package com.alekseew.projectmodule3.model.service;

import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpSession;

import static org.junit.jupiter.api.Assertions.*;

public class LanguageServiceTest {
    @Test
    void whenLanguageServiceCalled_thenReturnRightMessage() throws InterruptedException {
        assertAll(
                () -> assertEquals("R.I.P", LanguageService.getMessage("C")),
                () -> assertEquals("Good choose", LanguageService.getMessage("Java")),
                () -> assertEquals("Strange choose", LanguageService.getMessage("Erlang")),
                () -> assertEquals("How old are you?", LanguageService.getMessage("Pascal")),
                () -> assertEquals("You can choose better", LanguageService.getMessage("Python")),
                () -> assertEquals("Think again", LanguageService.getMessage("JavaScript")),
                () -> assertEquals("choose language",LanguageService.getMessage(null))
        );
    }
}
