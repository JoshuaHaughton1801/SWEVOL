package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;

public class cobolClass {

    @Test
    public void test() {
        // Two instances of cobol
        Cobol cobol1 = new Cobol();
        Cobol cobol2 = new Cobol();


        cobol1.setCommentLine("commentLine");
        cobol2.setCommentLine("commentLine2");

        cobol1.setConstantName("c1");
        cobol2.setConstantName("c2");

        cobol1.setConstantValue(1);
        cobol2.setConstantValue(2);

        cobol1.setDayDateWritten(0);
        cobol2.setDayDateWritten(0);

        cobol1.setDivisionName("dTest");
        cobol2.setDivisionName("dTest2");

        cobol1.setLineNumber(0);
        cobol2.setLineNumber(0);

        cobol1.setMonthDateWritten("23/02/2021");
        cobol2.setMonthDateWritten("23/02/2021");

        cobol1.setProgram_ID("idTest");
        cobol2.setProgram_ID("idTest2");

        cobol1.setSectionName("sName");
        cobol2.setSectionName("sName2");

        cobol1.setYearDateWritten(2021);
        cobol2.setYearDateWritten(2021);

        assertTrue(!cobol1.equals(cobol2)); // return true if equals is true
    }

}
