package cobol;

import parse.*;
import parse.tokens.*;

public class CommentAssembler extends Assembler{
	
	/**

	* Pop a string, and set the target DataDivision to this

	* string.

	*

	* @param Assembly the assembly to work on

	*/

	public void workOn(Assembly a) {

	//System.out.println("commentLineAssembler");

	Cobol c = new Cobol();

	Token t = (Token) a.pop();

	String output = "";
    while(a.hasMoreElements() && !a.stackIsEmpty()) {
        if(t.sval() != null) {
            output += t.sval();
            t = (Token)a.pop();
        }
        else if(t.sval() == null) {
            t = (Token)a.pop();
        }

	c.setCommentLine(t.sval().trim());

	a.setTarget(c); }

	}

} 
