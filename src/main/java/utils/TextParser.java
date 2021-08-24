package utils;

import java.util.ArrayList;
import java.util.List;

public class TextParser {

    public String parser(String initialKeyword, String finalKeyword, String input){

        int firstIndex = 0;

        List<String> lines = new ArrayList<>();
        input.lines().forEach(lines::add);

        for (String line: lines) {

            if (initialKeyword != null)
                firstIndex = line.indexOf(initialKeyword) + initialKeyword.length();

            if (initialKeyword != null && finalKeyword != null){

                //This is the case where the string will be cut from both sides
                if (line.contains(initialKeyword) && line.contains(finalKeyword)){

                    final int lastIndex = line.indexOf(finalKeyword);

                    return line.substring(firstIndex, lastIndex);

                }

            }
            else if (initialKeyword != null){

                //This is the case where only a single side of the string will be cut (left side)
                if (line.contains(initialKeyword)){

                    return line.substring(firstIndex);

                }

            }
            else if (finalKeyword != null){

                //This is the case where only a single side of the string will be cut (right side)
                if (line.contains(finalKeyword)){

                    final int lastIndex = line.indexOf(finalKeyword);

                    return line.substring(0, lastIndex);

                }

            }

        }

        return null;
    }

}
