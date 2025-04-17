package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void simulationRunsWithoutError() {
        assertDoesNotThrow(() -> {
            int[] n = {10};
            double[] p = {0.5};
            int m = 1;
            CoinFlipSimulator.runSimulation(n, p, m);
        });
    }
}