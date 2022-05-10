package com.danieltedman.hoist.internal.domain;

import com.danieltedman.hoist.internal.domain.simulation.Simulation;
import com.danieltedman.hoist.internal.domain.simulation.SimulationAlreadyStarted;
import com.danieltedman.hoist.internal.domain.simulation.SimulationNotStarted;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {
    @Test
    void testWhenStartedExistsWhenStartingSimulation() throws Throwable {
        final Simulation aSimulation = new Simulation();

        aSimulation.start();

        assertInstanceOf(Instant.class, aSimulation.whenStarted());
    }

    @Test
    void testWhenStartedAlwaysSame() throws Throwable {
        final Simulation aSimulation = new Simulation();

        aSimulation.start();

        final Instant firstWhenStarted = aSimulation.whenStarted();
        final Instant secondWhenStarted = aSimulation.whenStarted();

        assertEquals(firstWhenStarted, secondWhenStarted);
    }

    @Test
    void testWhenStartedThrowsWhenNotStartedYet() {
        final Simulation aSimulation = new Simulation();

        assertThrows(SimulationNotStarted.class, aSimulation::whenStarted);
    }

    @Test
    void testStartThrowsWhenAlreadyStarted() throws Throwable {
        final Simulation aSimulation = new Simulation();

        aSimulation.start();

        assertThrows(SimulationAlreadyStarted.class, aSimulation::start);
    }
}
