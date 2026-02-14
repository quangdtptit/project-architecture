package com.example.architecture.hexagon.domain.model.common;

public interface EventPayload {

    String getVersion();

    String getPartitionKey();
}
