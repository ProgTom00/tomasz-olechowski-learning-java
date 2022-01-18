package com.patterns2.prototype;

import java.util.ArrayList;
import java.util.List;

public class TasksList {

    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TasksList(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        String s = " List [" + name + "]";
        for (Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TasksList)) return false;

        TasksList tasksList = (TasksList) o;

        if (!name.equals(tasksList.name)) return false;
        return tasks.equals(tasksList.tasks);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + tasks.hashCode();
        return result;
    }
}