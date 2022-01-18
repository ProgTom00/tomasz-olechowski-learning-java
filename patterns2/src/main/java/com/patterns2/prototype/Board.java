package com.patterns2.prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Board extends Prototype<Board> {
    private String name;
    private Set<TasksList> listSet = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getListSet() {
        return listSet;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + " ]\n";
        for (TasksList list : listSet) {
            s = s + list.toString() + "\n";
        }
        return s;
    }
    public Board shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }
    public Board deepCopy() throws CloneNotSupportedException {
        Board cloneBoard = super.clone();
        cloneBoard.listSet = new HashSet<>();
        for (TasksList list : listSet) {
            TasksList clonedList = new TasksList(list.getName());
            for(Task task : list.getTasks()) {
                clonedList.getTasks().add(task);
            }
            cloneBoard.getListSet().add(clonedList);
        }
        return cloneBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(name, board.name) &&
                Objects.equals(listSet, board.listSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listSet);
    }
}