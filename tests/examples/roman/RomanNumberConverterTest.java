package examples.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberConverterTest {

    @Test
    @DisplayName("MMD") //Navngiver hvad testens navn bliver displayet som
    void convertToRomanNumber() {
       String expected = "MMD";
       String actual = RomanNumberConverter.convertToRomanNumber(2500);
       assertEquals(expected, actual);
    }


    //Vil give en fejl fordi klassen ikke tager højde for den her del af romer tal
    @Test
    @DisplayName("IX")
    void convert7ToRomanNumber() {
        String expected = "IX";
        String actual = RomanNumberConverter.convertToRomanNumber(9);
        assertEquals(expected, actual);
    }

}