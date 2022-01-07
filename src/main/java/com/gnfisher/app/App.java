package com.gnfisher.app;

import java.io.File;

import com.gnfisher.app.day1.Day1;

public class App {
    public static void main(String[] args) {
        // Reverse a string, warm up
        new ReverseString("gregory").run();

        // Advent of Code, Day 1, Part 1
        ClassLoader classLoader = App.class.getClassLoader();
        File depthsData = new File(classLoader.getResource("input_day1.txt").getFile());
        System.out.format("Depth Increments: %d%n", new Day1(depthsData).getDepthIncreases());
    }
}
