package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
   // Check if balanced brackets exist
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello"));
    }
    @Test
    public void onlyClosedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello]"));
    }

    @Test
    public void closedOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void closedOpenOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][["));
    }

    @Test
    public void openOpenClosedClosedClosedOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]["));
    }

    @Test
    public void closedOpenClosedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(("]LaunchCode[]")));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(("")));
    }

    @Test
    public void closedOpenReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void closedReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void openOpenClosedClosedClosedClosedOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]]["));
    }
}
