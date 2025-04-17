package org.example;

import java.util.Random;

public class CoinFlipSimulator {

    public static void runSimulation(int[] nValues, double[] pValues, int m) {
        Random rand = new Random();
        System.out.println("Number of Flips (n), Trial Number (m), Probability of Heads (p), Number of Heads");

        for (int n : nValues) {
            for (double p : pValues) {
                for (int trial = 1; trial <= m; trial++) {
                    int heads = 0;
                    for (int i = 0; i < n; i++) {
                        if (rand.nextDouble() < p) {
                            heads++;
                        }
                    }
                    System.out.printf("%d,%d,%.2f,%d%n", n, trial, p, heads);
                }
            }
        }
    }
}