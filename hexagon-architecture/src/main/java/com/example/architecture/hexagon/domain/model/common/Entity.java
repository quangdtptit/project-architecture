package com.example.architecture.hexagon.domain.model.common;

import java.util.Objects;

public abstract class Entity<ID> {

    public abstract ID getIdentify();

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Entity<?> entity = (Entity) o;
            return Objects.equals(this.getIdentify(), entity.getIdentify());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.getIdentify());
    }
}
