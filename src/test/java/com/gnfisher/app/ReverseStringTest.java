package com.gnfisher.app;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ReverseStringTest {
    @Test
    public void shouldReverseTheString() {
        String result = new ReverseString("gregory").reverse();
        String expected = "yrogerg";

        assertEquals(true, result.equals(expected));
    }
}
