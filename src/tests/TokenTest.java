package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.*;

public class TokenTest {

    @Test
    public void test() {
        char c = 'a';
        Token t = new Token(c);
        assertFalse(t.isNumber());
        assertFalse(t.isWord());
        assertTrue(t.isSymbol());

    }

    @Test
    public void test2() {
        Token t2 = new Token(1);
        assertTrue(t2.isNumber());
        assertFalse(t2.isWord());
        assertFalse(t2.isSymbol());
    }

    @Test
    public void test3() {
        Token t3 = new Token("Hello");
        assertFalse(t3.isNumber());
        assertTrue(t3.isWord());
        assertFalse(t3.isSymbol());
    }
}