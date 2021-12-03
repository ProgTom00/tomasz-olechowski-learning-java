package com.learning.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String sampleText, PoemDecorator poemDecorator) {
        String sampleResult = poemDecorator.decorate(sampleText);
        System.out.println("Text before using method: " + sampleResult);
        System.out.println("Text after using method: " + sampleResult);


    }
}
