package com.learning.stream;

import com.learning.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Sample text", String::toUpperCase);
        poemBeautifier.beautify("Sample text", n -> "ABC " + n);
        poemBeautifier.beautify("Sample text", n -> "" + n + " ABC");
        poemBeautifier.beautify("Sample text", String::toLowerCase);
        poemBeautifier.beautify("Sample text", n -> n.replace('s', 'S'));


    }
}
