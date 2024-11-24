package org.example.problems.arrays;

/*
    Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

    Please implement encode and decode
 */

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    // Example List<String>: [we, say, :, yes]
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("?").append(str);
        }
        return sb.toString();
    }

    // Example String: 2?we3?say1?:3?yes
    public List<String> decode(String str) {
        List<String> resultString = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '?') {
                j++;
            }
            int lengthOfWord = Integer.parseInt(str.substring(i, j));
            j++;
            i = j + lengthOfWord;
            resultString.add(str.substring(j, i));
        }
        return resultString;
    }
}
