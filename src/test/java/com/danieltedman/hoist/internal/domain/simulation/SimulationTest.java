package com.danieltedman.hoist.internal.domain.simulation;

import com.danieltedman.hoist.internal.domain.floor.Floor;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {
    @Test
    void testWhenStartedExistsWhenStartingSimulation() throws Throwable {
        final var floors = Collections.singletonList(new Floor(0));
        final Simulation aSimulation = new Simulation(floors);

        aSimulation.start();

        assertInstanceOf(Instant.class, aSimulation.whenStarted());
    }

    @Test
    void testWhenStartedAlwaysSame() throws Throwable {
        final var floors = Collections.singletonList(new Floor(0));
        final Simulation aSimulation = new Simulation(floors);

        aSimulation.start();

        final Instant firstWhenStarted = aSimulation.whenStarted();
        final Instant secondWhenStarted = aSimulation.whenStarted();

        assertEquals(firstWhenStarted, secondWhenStarted);
    }

    @Test
    void testWhenStartedThrowsWhenNotStartedYet() throws Throwable {
        final var floors = Collections.singletonList(new Floor(0));
        final Simulation aSimulation = new Simulation(floors);

        assertThrows(SimulationNotStarted.class, aSimulation::whenStarted);
    }

    @Test
    void testStartThrowsWhenAlreadyStarted() throws Throwable {
        final var floors = Collections.singletonList(new Floor(0));
        final Simulation aSimulation = new Simulation(floors);

        aSimulation.start();

        assertThrows(SimulationAlreadyStarted.class, aSimulation::start);
    }

    @Test
    void testHasAtLeastOneFloor() {
        assertThrowsExactly(SimulationContainsNoFloors.class, () -> {
            new Simulation(new ArrayList<>());
        });
    }

    @Test
    void testFailsWhenProvidedNullFloors() {
        assertThrowsExactly(SimulationContainsNoFloors.class, () -> {
            new Simulation(null);
        });
    }
}
