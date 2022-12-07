package test.codewars;

import com.codewars.DisemvowelTrolls;
import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class DisemvowelTrollsTest {

    @Test
    @DisplayName("Should return the given string but without vowels")
    public void disemvowel(){
        String text = "Hello world, this is a test";

        assertEquals("Hll wrld, ths s  tst", DisemvowelTrolls.disemvowel(text));
    }
}
