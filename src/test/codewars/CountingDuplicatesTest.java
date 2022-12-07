package test.codewars;

import com.codewars.CountingDuplicates;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CountingDuplicatesTest {

    @Test
    @DisplayName("Should return zero if the string is empty")
    public void emptyReturnsZero() {
        Assertions.assertEquals(0, CountingDuplicates.countDuplicates(""));
    }
    @Test
    @DisplayName("Should return the number of repeated characters, in this string are 7 different repeated characters")
    public void countDuplicates(){
        String actual = "Hello world, this is a test";

        assertEquals(7, CountingDuplicates.countDuplicates(actual));
    }
    @Test
    @DisplayName("Should return the same array but sorted")
    public void sort(){
        String[] expected = new String[]{"A", "B", "C", "D", "E", "F", "G"};
        String[] actual = new String[]{"B", "C", "A", "F", "D", "G" , "E"};

        assertArrayEquals(expected, CountingDuplicates.sort(actual));
    }

}