package com.danieltedman.hoist.internal.domain.simulation;

import com.danieltedman.hoist.internal.domain.floor.Floor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private Instant whenStarted;
    private final List<Floor> floors;

    public Simulation(final List<Floor> floors) {
        this.floors = floors;
    }

    public void start() throws SimulationAlreadyStarted, SimulationContainsNoFloors {
        if (whenStarted != null) {
            throw new SimulationAlreadyStarted();
        }
        if (floors == null || floors.isEmpty()) {
            throw new SimulationContainsNoFloors();
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
