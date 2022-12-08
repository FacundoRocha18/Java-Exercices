package test.openbootcamp.temas789;

import com.openbootcamp.temas789.Temas789;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Temas789Test {

    /**
     * This exercises are following TDD
     * Estos ejercicios siguen TDD
     * @author Facundo Rocha
     */

    @Test
    @DisplayName("reverseString should return the text from parameters but reversed")
    public void reverseString() {
        String actual = "Hola mundo";
        String expected = "odnum aloH";

        assertEquals(expected, Temas789.reverseString(actual));
    }

    @Test
    @DisplayName("loopArray should loop an array and show each value")
    public void loopArray() {
        String[] arr = new String[]{"Hola", "Mundo"};
        String[] expected = new String[]{"Hola", "Mundo"};

        assertArrayEquals(expected, Temas789.loopArray(arr));
    }

    @Test
    @DisplayName("loopBiArray should loop a bidimensional array and show each value")
    public void loopBiArray() {
        Integer[][] arr = new Integer[][]{new Integer[]{1, 2, 3, 4, 5}, new Integer[]{6, 7, 8, 9, 10}};
        Integer[][] expected = new Integer[][]{new Integer[]{1, 2, 3, 4, 5}, new Integer[]{6, 7, 8, 9, 10}};

        assertArrayEquals(expected, Temas789.loopBiArray(arr));
    }

    @Test
    @DisplayName("should show a 5 element Vector without 2nd and 3rd element")
    public void deleteElements() {
        Vector<Integer> actual = new Vector<>();

        for (int i = 0; i < 5; i++) {
            actual.add(i);
        }
        System.out.println(actual);
        Vector<Integer> expected = new Vector<>();

        expected.add(0);
        expected.add(3);
        expected.add(4);

        assertEquals(expected, Temas789.deleteElements(actual));
    }

    @Test
    @DisplayName("removePairNumbers should return the given ArrayList without pair numbers")
    public void removePairNumbers() {
        ArrayList<Integer> actual = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            actual.add(i + 1);
        }
        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);


        assertEquals(expected, Temas789.removePairNumbers(actual));
    }

    @Test
    @DisplayName("divideByZero should return an ArithmeticException")
    public void divideByZero() {
        try {
            Integer result = Temas789.divideByZero(5);
            System.out.println(result);

        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    @Test
    @DisplayName("copyFile should receive a fileIn and copy it into fileOut")
    public void copyFile() throws IOException {
        String fileIn = "C:\\Users\\facun\\Desktop\\Development\\OpenBootcamp\\java\\Java-Exercices\\CodeWars and OpenBootcamp exercises\\fileIn.txt";
        String fileOut = "C:\\Users\\facun\\Desktop\\Development\\OpenBootcamp\\java\\Java-Exercices\\CodeWars and OpenBootcamp exercises\\fileIn2.txt";

        try {
            assertEquals(true, Temas789.copyFile(fileIn, fileOut));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            assertEquals("IO failure", Temas789.copyFile(fileIn, fileOut));
        }
    }
}
