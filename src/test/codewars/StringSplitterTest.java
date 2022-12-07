package test.codewars;

import static org.junit.Assert.assertEquals;

import com.codewars.StringSplitter;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitterTest {
    @Test
    @DisplayName("Should add a _ at the end of an odd word")
    public void handleOddWords(){
        String actual = "Hello";
        String expected = "Hello_";

        assertEquals(expected, StringSplitter.handleOddWords(actual));
    }
    @Test
    @DisplayName("Should separate the string into a words array")
    public void splitStringIntoWords(){
        String actual = "Hello world";
        String[] expected = new String[]{"Hello", "world"};

        assertEquals(expected, StringSplitter.splitStringIntoWords(actual));
    }

    @Test
    @DisplayName("Should split a word into a characters pairs array")
    public void splitWordIntoCharacters(){
        String actual = "Hello";
        String[] expected = new String[]{"He","ll","o_"};

        assertEquals(expected, StringSplitter.splitWordIntoCharacters(actual));
    }

    @Test
    @DisplayName("Should return an array of characters pairs")
    public void solution(){
        List<String[]> actual = StringSplitter.solution("Hello");
        String[] expected = new String[]{"He","ll","o_"};

        actual.forEach((pair) -> {
            assertEquals(expected, pair);
        });

    }
}
