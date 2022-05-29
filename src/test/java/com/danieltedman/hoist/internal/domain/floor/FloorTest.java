package com.danieltedman.hoist.internal.domain.floor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class FloorTest {
    @Test
    void testMustHaveFloorNumber() {
        assertThrowsExactly(InvalidFloorLevel.class, () -> {
            new Floor(null);
        });
    }

    @Test
    void testAcceptsZerothFloor() {
        assertThatNoException().isThrownBy(() -> {
            new Floor(0);
        });
    }
}
