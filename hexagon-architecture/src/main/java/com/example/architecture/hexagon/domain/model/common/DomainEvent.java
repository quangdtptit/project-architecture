package com.example.architecture.hexagon.domain.model.common;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public abstract class DomainEvent implements EventPayload {

    private Instant occurredOn;
    private String version;

    public DomainEvent() {
        this.occurredOn = Instant.now();
        this.version = "1.0";
    }
}