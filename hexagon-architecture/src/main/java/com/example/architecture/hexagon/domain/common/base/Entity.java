package com.example.architecture.hexagon.domain.common.base;

import java.util.Objects;

public abstract class Entity<T> {
    protected T id;

    public Entity() {
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Entity<?> entity = (Entity)o;
            return Objects.equals(this.id, entity.id);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id});
    }

    public T getId() {
        return this.id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
