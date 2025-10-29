package com.example.architecture.hexagon.domain.common.base;

import java.util.Objects;

public abstract class ValueObject {
    // Ensures equality is based on the value (attributes)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(this, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    // For value objects, no setters should be provided
    // All fields should be final and assigned through constructors
}
