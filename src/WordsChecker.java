package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String text;
    private Set<String> setWords;

    public WordsChecker(String text) {
        this.text = text;
        setWords = new HashSet<>();
        setWords = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return setWords.contains(word);
    }
}
