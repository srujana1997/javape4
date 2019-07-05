package com.stackroute.javape4;
//program to find out the multiple occurrences of the given word in a ​ string​ using Matcher methods.
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class MatchesMethodDemo {
        public List<Integer> getStringMatches(String input, String pattern)
        {
            List<Integer> positions = new ArrayList();

            if(input != null && !input.isEmpty()) {
                Pattern p = Pattern.compile(pattern);  // compiles pattern
                Matcher m = p.matcher(input);       // match pattern for the given input
                while (m.find()) {
                    positions.add(m.start());
                }
            }
            else
            {
                positions = null;
            }

            return positions;
        }
}
