package com.danieltedman.hoist.internal.domain.floor;

public class Floor {
    public Floor(final Integer floorNumber) throws InvalidFloorLevel {
        if (floorNumber == null) {
            throw new InvalidFloorLevel();
        }
    }
}
