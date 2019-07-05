package com.stackroute.javape4;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
    public class StringTransposeTest {

        public static StringTranspose stringTranspose;

        @BeforeClass
        public static void setUp()
        {
            stringTranspose = new StringTranspose();
        }

        @AfterClass
        public static void tearDown()
        {
            stringTranspose = null;
        }

        @Test
        public void givenStringShouldReturnStringTranspose()
        {
            assertEquals("sihT si elpmas margorp",stringTranspose.getStringTranspose("This is sample program"));

            assertEquals("sihT si margorp 21",stringTranspose.getStringTranspose("This is program 12"));
        }

        @Test
        public void givenNullShouldReturnErrorMessage()
        {
            assertEquals("String must not be null or empty",stringTranspose.getStringTranspose(null));
        }

        @Test
        public void givenEmptyStringShouldReturnErrorMessage()
        {
            assertEquals("String must not be null or empty",stringTranspose.getStringTranspose(""));
        }

    }
