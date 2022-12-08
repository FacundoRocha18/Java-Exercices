package com.openbootcamp.swing;

import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
@Description("Tests on IvaCalculatorUI app")
public class IvaCalculatorUITest {
    @Test
    @DisplayName("validateDouble should take a field string, validate that it doesn´t contains letters and then parse it to double and return it")
    public void validateDouble() throws NumberFormatException {
        String fieldTextRight = "18.0";
        double expected = 18.0;
        String fieldTextWrong = "18wf3";

        try {
            assertEquals(expected, IvaCalculatorUI.validateDouble(fieldTextRight));
        } catch (NumberFormatException e) {
            System.out.println(e);
            assertEquals("No pueden haber letras en el campo Precio", IvaCalculatorUI.validateDouble(fieldTextWrong));
        }
    }
}