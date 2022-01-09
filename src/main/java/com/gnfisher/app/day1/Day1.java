package com.gnfisher.app.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day1 {
    public FileReader file;

    public Day1(File data) {
        try {
            file = new FileReader(data);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Invalid File path, could not continue.");
        }
    }

    public int getDepthIncreases() {
        try (Scanner scanner = new Scanner(file)) {
            return countDepthIncreases(scanner);
        }
    }

    private int countDepthIncreases(Scanner scanner) {
        int previousDepth = -1;
        int depthIncrements = 0;

        while (scanner.hasNextInt()) {
            int currentDepth = scanner.nextInt();
            if (depthIncreased(previousDepth, currentDepth)) depthIncrements++;
            previousDepth = currentDepth;
        }
        return depthIncrements;
    }

    private boolean depthIncreased(int previousDepth, int currentDepth) {
        return currentDepth > previousDepth && previousDepth > 0;
    }
}
