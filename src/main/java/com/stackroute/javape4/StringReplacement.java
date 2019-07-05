package com.stackroute.javape4;
//program to replace all d with f and all l with t in the given ​String
    public class StringReplacement {

        public String replaceCharacters(String content)
        {
            String result;

            if(content != null && !content.isEmpty()) {

                //replacing both d by f and  by t
                result = content.replace("d","f").replace("l","t");
            }
            else
            {
                result = "String must not be null or empty";
            }
            return result;
        }
}
