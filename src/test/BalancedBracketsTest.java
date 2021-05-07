package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oddNumberBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void repeatedOpeningBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));

    }

    @Test
    public void repeatedClosingBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void wordEnclosedInDoubleBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[word]]"));
    }

    @Test
    public void doubleBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void wordEnclosedInBracketsPlusNewWordReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[new]word"));
    }

    @Test
    public void RandomCharactersInBracketsReturnTrue() {
        // failed with the escape character
        assertTrue(BalancedBrackets.hasBalancedBrackets("[9$7}Agc~]"));
    }

    @Test
    public void escapeClauseInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\\]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void closedBracketsAndOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
}
