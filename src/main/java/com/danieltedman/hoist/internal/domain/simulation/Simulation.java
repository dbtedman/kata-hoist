package com.danieltedman.hoist.internal.domain.simulation;

import com.danieltedman.hoist.internal.domain.floor.Floor;

import java.time.Instant;
import java.util.List;

public class Simulation {
    private Instant whenStarted;

    public Simulation(final List<Floor> floors) throws SimulationContainsNoFloors {
        if (floors == null || floors.isEmpty()) {
            throw new SimulationContainsNoFloors();
        }
    }

    public void start() throws SimulationAlreadyStarted {
        if (whenStarted != null) {
            throw new SimulationAlreadyStarted();
        }
        whenStarted = Instant.now();
    }

    public Instant whenStarted() throws SimulationNotStarted {
        if (whenStarted == null) {
            throw new SimulationNotStarted();
        }
        return whenStarted;
    }
}
