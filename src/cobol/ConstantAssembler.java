package cobol;

import parse.*;
import parse.tokens.*;

public class ConstantAssembler extends Assembler{

    public void workOn(Assembly a) {
        Cobol c = new Cobol();
        Token t = (Token) a.pop();
        c.setConstantValue( t.nval() );
        

        t = (Token) a.pop();
        //This should be the word "value" so we don't need any action here
        //String tokenString = t.sval();
        //System.out.println("Token string[3]: " + tokenString );

        t = (Token) a.pop();
        c.setConstantName(t.sval() );
        //System.out.println("Token string[2]: " + c.getConstantName() );


        t = (Token) a.pop();
        c.setLineNo( (int) Math.round(t.nval()) );
        //System.out.println("Token string[2]: " + c.getLineNumber() );

        a.setTarget(c);
    }
}