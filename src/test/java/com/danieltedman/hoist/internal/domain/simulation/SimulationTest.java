package com.danieltedman.hoist.internal.domain.simulation;

import com.danieltedman.hoist.internal.domain.floor.Floor;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {
    @Test
    void testWhenStartedExistsWhenStartingSimulation() throws Throwable {
        final Simulation aSimulation = new Simulation(
            Collections.singletonList(
                new Floor()
            )
        );

        aSimulation.start();

        assertInstanceOf(Instant.class, aSimulation.whenStarted());
    }

    @Test
    void testWhenStartedAlwaysSame() throws Throwable {
        final Simulation aSimulation = new Simulation(
            Collections.singletonList(
                new Floor()
            )
        );

        aSimulation.start();

        final Instant firstWhenStarted = aSimulation.whenStarted();
        final Instant secondWhenStarted = aSimulation.whenStarted();

        assertEquals(firstWhenStarted, secondWhenStarted);
    }

    @Test
    void testWhenStartedThrowsWhenNotStartedYet() {
        final Simulation aSimulation = new Simulation(
            Collections.singletonList(
                new Floor()
            )
        );

        assertThrows(SimulationNotStarted.class, aSimulation::whenStarted);
    }

    @Test
    void testStartThrowsWhenAlreadyStarted() throws Throwable {
        final Simulation aSimulation = new Simulation(
            Collections.singletonList(
                new Floor()
            )
        );

        aSimulation.start();

        assertThrows(SimulationAlreadyStarted.class, aSimulation::start);
    }

    @Test
    void testHasAtLeastOneFloor() {
        final Simulation aSimulation = new Simulation(new ArrayList<>());

        assertThrows(SimulationContainsNoFloors.class, aSimulation::start);
    }

    @Test
    void testFailsWhenProvidedNullFloors() {
        // TODO: Should the constructor throw an exception here instead?
        final Simulation aSimulation = new Simulation(null);

        assertThrows(SimulationContainsNoFloors.class, aSimulation::start);
    }
}
