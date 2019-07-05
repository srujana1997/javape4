package com.stackroute.javape4;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
    public class DictionaryOrderGeneratorTest {

        public static DictionaryOrderGenerator dictionaryOrderGenerator;

        @BeforeClass
        public static void setUp()
        {
            dictionaryOrderGenerator = new DictionaryOrderGenerator();
        }

        @AfterClass
        public static void tearDown()
        {
            dictionaryOrderGenerator = null;
        }

        @Test
        public void givenStringShouldReturnSortedList()
        {
            assertArrayEquals(new String[] {"1","is","paragraph","test","this"}, dictionaryOrderGenerator.sortAsDictionaryOrder("this is test paragraph 1"));

            assertArrayEquals(new String[] {"A","is","paragraph","test","This"}, dictionaryOrderGenerator.sortAsDictionaryOrder("This is A test paragraph"));

            assertArrayEquals(new String[] {"A","A","and","laptop","mouse"}, dictionaryOrderGenerator.sortAsDictionaryOrder("A laptop and A mouse"));
        }

        @Test
        public void givenNullShouldReturnNull()
        {
            assertNull(dictionaryOrderGenerator.sortAsDictionaryOrder(null));
        }

        @Test
        public void givenEmptyStringShouldReturnNull()
        {
            assertNull(dictionaryOrderGenerator.sortAsDictionaryOrder(""));
        }
}