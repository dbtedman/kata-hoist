package com.danieltedman.hoist.internal.gateway.time;

import java.time.Instant;

public class TimeGateway {
    public Instant now() {
        return Instant.now();
    }
}
