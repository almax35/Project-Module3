package com.alekseew.projectmodule3.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
                () -> assertEquals("choose language", LanguageService.getMessage(null))
        );
    }
}
