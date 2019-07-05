package com.stackroute.javape4;
//program to transpose the given ​ string​ .

    public class StringTranspose {
        public String getStringTranspose(String content)
        {
            String result = "";

            if(content != null && !content.isEmpty()) {

                String[] words = content.split(" ");

                StringBuffer[] sortedWords = new StringBuffer[words.length];

                for (int i = 0; i < words.length; i++) { //iterating through words to reverse each word

                    sortedWords[i] = new StringBuffer(words[i]);

                    sortedWords[i].reverse();
                }

                for (StringBuffer sortedWord : sortedWords) {  // converting array of strings into string

                    result = result.concat(sortedWord.toString()).concat(" ");
                }

                result = result.trim();
            }
            else
            {
                result = "String must not be null or empty";
            }

            return result;
        }
    }

