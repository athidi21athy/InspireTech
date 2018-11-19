package com.athidi21athy.inspireTech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormaliserTest {
    @ParameterizedTest()
    @CsvSource({
            "Java Engineer, Software Engineer",
            "Accountant, Accountant",
            "accountant, Accountant",
            "jaccountants, Unknown"
    })
    public void givenInputToNormaliseReturnsNormalised(String input, String expected) {
        Normaliser sut = new Normaliser();
        String actual = sut.normalise(input);
        assertEquals(expected, actual);
    }
}