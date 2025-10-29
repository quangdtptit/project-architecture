package com.example.architecture.hexagon.domain.common.event;

public interface EventPayload {
    String getVersion();

    String getPartitionKey();
}
