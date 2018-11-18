package com.athidi21athy.inspireTech;

import java.util.Arrays;

public class Normaliser {
    public String normalise(String input) {
        String[] tokens = input.split(" ");
        if(Arrays.stream(tokens).anyMatch(t -> t.toLowerCase().equals("accountant")))
            return "Accountant";
        else if (Arrays.stream(tokens).anyMatch(t -> t.toLowerCase().equals("engineer")))
            return "Software Engineer";
        else
            return "Unknown";
    }
}
