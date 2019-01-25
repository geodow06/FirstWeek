package com.qa.projectTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class AppTest extends TestCase
{
   
    public void testApp()
    { 
        assertEquals( 2, App.blackjackHand(1,2)); 
        assertEquals( 4 , App.blackjackHand(4, 1)); 
        assertEquals(0,App.blackjackHand(4, 4)); 
        assertEquals(4,App.blackjackHand(22, 4)); 
        assertEquals(1,App.blackjackHand(1, 22)); 
        assertEquals(0,App.blackjackHand(22, 22));
    }

	

	
}
