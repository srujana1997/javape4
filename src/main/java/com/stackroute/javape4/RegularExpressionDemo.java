package com.stackroute.javape4;
//program with the implementation of ​ Regular Expression​ to find the presence of the name
//Harry in a ​ string​ .
    public class RegularExpressionDemo {
        public boolean isHarryExits(String string)
        {
            boolean result = false;

            if(string != null && !string.isEmpty())
            {
                result = string.matches(".*(Harry|harry).*");  //regex to match harry ignore case
            }

            return result;
        }

    }
