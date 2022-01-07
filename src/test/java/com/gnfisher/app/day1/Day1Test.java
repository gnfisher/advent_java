package com.gnfisher.app.day1;

import static org.junit.Assert.*;
import java.io.File;

import org.junit.Test;

public class Day1Test {
    @Test
    public void countsIncreases() {
        ClassLoader classLoader = getClass().getClassLoader();
        File depthsData = new File(classLoader.getResource("input_day1.txt").getFile());

        int expected = 7;
        int result = new Day1(depthsData).getDepthIncreases();

        assertEquals(expected, result);
    }
}
