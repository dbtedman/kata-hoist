package com.danieltedman.hoist.internal.domain.simulation;

import java.time.Instant;

public class Simulation {
    private Instant whenStarted;

    public void start() {
        whenStarted = Instant.now();
    }

    public Instant whenStarted() throws SimulationNotStarted {
        if (whenStarted == null) {
            throw new SimulationNotStarted();
        }
        return whenStarted;
    }
}
