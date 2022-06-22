package com.danieltedman.hoist.internal.gateway.time;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

class TimeGatewayTest {
    @Test
    void canTellTheTime() {
        final var gateway = new TimeGateway();
        final Instant result = gateway.now();

        assertThat(result).isInstanceOf(Instant.class);
    }
}
