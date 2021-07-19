package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.*;
import java.util.ArrayList;

public class SymbolTest {

    @Test
    public void test() {
        char c = 'a';
        Symbol symbol = new Symbol(c);
        ArrayList<String> v = new ArrayList<String>();
        v = symbol.randomExpansion(2, 1);
        assertFalse(v.isEmpty());
    }

}
