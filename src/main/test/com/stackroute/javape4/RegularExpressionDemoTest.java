package com.stackroute.javape4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

    public class RegularExpressionDemoTest {

        public static RegularExpressionDemo regularExpressionDemo;

        @BeforeClass
        public static void setUp()
        {
            regularExpressionDemo = new RegularExpressionDemo();
        }

        @AfterClass
        public static void tearDown()
        {
            regularExpressionDemo = null;
        }

        @Test
        public void givenStringShouldReturnTrue()
        {
            assertTrue(regularExpressionDemo.isHarryExits("This is Harry"));
            assertTrue(regularExpressionDemo.isHarryExits("harrypotter series"));
            assertTrue(regularExpressionDemo.isHarryExits("Here Harry exists!"));
        }

        @Test
        public void givenNullShouldReturnFalse()
        {
            assertFalse(regularExpressionDemo.isHarryExits(null));
        }

        @Test
        public void givenStringShouldReturnFalse()
        {
            assertFalse(regularExpressionDemo.isHarryExits(""));
            assertFalse(regularExpressionDemo.isHarryExits("This is henry"));
        }

    }
