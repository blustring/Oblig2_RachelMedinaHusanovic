package no.rachelmh.leapYear;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    LeapYear leapYear;
    @BeforeEach
    void setup() {
        leapYear = new LeapYear();
    }

    @Test()
    public void isDivisibleBy4ButNotDivisibleBy100() {
        boolean ans = true;
        boolean val;
        val = leapYear.isLeapYear(2012);
        assertEquals(ans,val);
    }
/*
    @Test
    public void CenturyTestForNotLeapYear(){
        boolean ans = true;
        boolean val;
        val = leapYear.isLeapYear(1700);
        assertTrue(ans, String.valueOf(val));
    }

 */
    @Test
    public void notALeapyear(){
        boolean ans = true;
        boolean val;
        val = leapYear.isLeapYear(1703);
        assertTrue(ans, String.valueOf(val));
    }


    @Test()
    public void DivisibleBy4() {
        boolean ans = true;
        boolean val;
        val = leapYear.isLeapYear(2008);
        assertEquals(ans,val);
    }
/*
    @Test()
    public void DivisibleBy400() {
        boolean ans = true;
        boolean val;
        val = leapYear.isLeapYear(1924);
        assertEquals(ans, val);
    }

    @Test()
    public void notDivisibleBy100() {
        boolean ans = true;
        boolean val;
        val = leapYear.isLeapYear(1924);
        assertEquals(ans, val);
    }
*/
    @Test
    public void notDivisibleBy4divisibleBy100(){
        boolean ans = false;
        boolean val;
        val = leapYear.isLeapYear(1925);
        assertEquals(ans, val);
    }
    @Test
    void leapYear2004() {
        assertTrue(leapYear.isLeapYear(2004));}

    @Test
    void notLeapYear2003() {
        assertFalse(leapYear.isLeapYear(2003));}
    
    @Test
    void divisibleBy100butNot400(){
        assertFalse(leapYear.isLeapYear(1900));
    }
}