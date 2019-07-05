package com.stackroute.javape4;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
    public class StringReplacementTest {

        public static StringReplacement stringReplacement;

        @BeforeClass
        public static void setUp()
        {
            stringReplacement = new StringReplacement();
        }

        @AfterClass
        public static void tearDown()
        {
            stringReplacement = null;
        }


        @Test
        public void givenStringShouldReturnStringAfterReplacingdAndl()
        {
            assertEquals("fairy mitk", stringReplacement.replaceCharacters("dairy milk"));
        }

        @Test
        public void givenStringShouldReturnStringAfterReplacingl()
        {
            assertEquals("tetters", stringReplacement.replaceCharacters("letters"));
        }

        @Test
        public void givenStringShouldReturnOriginalString()
        {
            assertEquals("Dairy", stringReplacement.replaceCharacters("Dairy"));
        }

        @Test
        public void givenNullShouldReturnErrorMessage()
        {
            assertEquals("String must not be null or empty", stringReplacement.replaceCharacters(null));
        }

        @Test
        public void givenEmptyStringShouldReturnErrorMessage()
        {
            assertEquals("String must not be null or empty", stringReplacement.replaceCharacters(""));
        }

}