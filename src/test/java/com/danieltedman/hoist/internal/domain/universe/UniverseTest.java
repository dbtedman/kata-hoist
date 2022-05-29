package com.danieltedman.hoist.internal.domain.universe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UniverseTest {
    @Test
    void testUniverseCanExistWithoutAnySimulations() {
        final var universe = new Universe();

        assertThat(universe.simulations()).hasSize(0);
    }
}
