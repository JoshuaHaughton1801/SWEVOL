package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.tokens.Word;

public class wordTest {

    @Test
    public void test() {
        Word word = new Word();
        ArrayList<String> generatedWord = word.randomExpansion(3,7);
        for(int i=0; i<= generatedWord.size();i++) 
            for(String w : generatedWord) 
                assertTrue(w.matches("[a-zA-Z]+"));
    }

}
