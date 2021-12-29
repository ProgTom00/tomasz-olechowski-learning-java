package com.exceptions.main;

import com.exceptions.io.FileReader;
import com.exceptions.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }


    }
}
