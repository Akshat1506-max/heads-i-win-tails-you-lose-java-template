package org.example;

public class App {
    public static void main(String[] args) {
        int[] nValues = {10, 50, 100, 200, 500};
        double[] pValues = {0.3, 0.5, 0.75};
        int m = 10;

        CoinFlipSimulator.runSimulation(nValues, pValues, m);
    }

    public String getGreeting() {
        return "Hello World!";
    }
}