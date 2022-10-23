package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> setWords = new HashSet<>();
        setWords = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
        return setWords.contains(word);
    }
}
