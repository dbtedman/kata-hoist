package com.danieltedman.hoist.internal.domain.universe;

import com.danieltedman.hoist.internal.domain.entity.universe.Universe;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UniverseTest {
    @Test
    void testUniverseCanExistWithoutAnySimulations() {
        final var universe = new Universe();

        assertThat(universe.simulations()).hasSize(0);
    }
}
