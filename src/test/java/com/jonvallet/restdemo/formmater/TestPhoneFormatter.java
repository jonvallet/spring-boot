package com.jonvallet.restdemo.formmater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPhoneFormatter {

    @Test
    public void testPhoneFormatter() {
        String expectedValue = "+1 512-684-1100";
        String actualValue = PhoneFormatter.format("15126841100");

        assertEquals(expectedValue, actualValue);
    }
}
