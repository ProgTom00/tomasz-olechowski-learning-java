package com.patterns2.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BoardTestSuite {

    @Test
    void testToString() {
        // Given
        // Creating the TaskList for todos
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));
        // creating the TaskList for tasks in progress
        TasksList listInProgress = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));
        // creating the TaskList for done tasks
        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));
        // creating the board and assign the lists
        Board board = new Board("Project number 1");
        board.getListSet().add(listToDo);
        board.getListSet().add(listInProgress);
        board.getListSet().add(listDone);

        // making a shallow clone of object board
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        // making a deep copy of object board
        Board deepCopy = null;
        try {
            deepCopy = board.deepCopy();
            deepCopy.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        // When
        board.getListSet().remove(listToDo);
        // Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCopy);
        assertEquals(2, board.getListSet().size());
        assertEquals(2, cloneBoard.getListSet().size());
        assertEquals(3, deepCopy.getListSet().size());
        assertEquals(cloneBoard.getListSet(), board.getListSet());
        assertNotEquals(deepCopy.getListSet(), board.getListSet());
    }
}