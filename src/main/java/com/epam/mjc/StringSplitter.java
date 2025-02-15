package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringSplitter {

    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        if (source == null || delimiters == null || delimiters.isEmpty()) {
            return Collections.emptyList();
        }
        String regex = String.join("|", delimiters);
        String[] tokens = source.split(regex);
        List<String> list = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                list.add(token);
            }
        }
        return list;
    }
}
