package com.example.architecture.hexagon.domain.common.base;

import java.util.ArrayList;
import java.util.List;

public abstract class Root<T>  extends Entity<T> {
    private List<DomainEvent> domainEvents = new ArrayList<>();

    // Add a domain event
    protected void addDomainEvent(DomainEvent event) {
        domainEvents.add(event);
    }

    // Get and clear domain events (used for event publishing)
    public List<DomainEvent> getDomainEvents() {
        List<DomainEvent> events = new ArrayList<>(domainEvents);
        domainEvents.clear();
        return events;
    }
}
