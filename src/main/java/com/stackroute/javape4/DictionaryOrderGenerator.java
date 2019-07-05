package com.stackroute.javape4;
import java.util.Arrays;
import java.util.stream.Stream;
    public class DictionaryOrderGenerator {
        public String[] sortAsDictionaryOrder(String paragraph)
        {
            String[] sortedWords;
            String temp;
            if(paragraph != null && !paragraph.isEmpty()) { // checking null or empty condition
                sortedWords = paragraph.split(" ");

                for(int i=0; i < sortedWords.length; i++)  //logic to sort as alphabetical order
                {
                    for (int j=i; j < sortedWords.length; j++)
                    {
                        if(sortedWords[i].compareToIgnoreCase(sortedWords[j]) > 0)
                        {
                            temp = sortedWords[i];
                            sortedWords[i] = sortedWords[j];
                            sortedWords[j] = temp;
                        }
                    }
                }
            }
            else {
                sortedWords = null;
            }
            return sortedWords;
        }
    }

