package com.exceptions.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        // Given
        FileReader reader = new FileReader();

        // when && then
        assertDoesNotThrow(() -> reader.readFile());
    }
/*
    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        // Given
        FileReader fileReader = new FileReader();
        String fileName = "there_is_no_such_a_file.txt";
        // When && Then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));

    }

    @Test
    void testReadFileWithName() {
        // Given
        FileReader reader = new FileReader();
        // When && Then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> reader.readFile("there_is_no_such_a_file.txt")),
                () -> assertThrows(FileReaderException.class, () -> reader.readFile(null)),
                () -> assertDoesNotThrow(() -> reader.readFile("names.txt")));
    }*/
}