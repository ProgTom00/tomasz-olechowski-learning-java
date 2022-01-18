package com.patterns2.prototype;

public final class Task {

    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " Task [" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        return name.equals(task.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
