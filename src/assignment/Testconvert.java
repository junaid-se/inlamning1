package assignment;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testconvert {
    @Test
    public void testconMorsetoX() {

        Converter converter = new Converter();

        String testdata = "-..-";
        String expected = "X";

        String actual = converter.engToMorse(testdata);

        assertEquals(expected, actual);
    }
    @Test
    public void testconBtoMorse() {

        Converter converter = new Converter();

        String testdata = "B";
        String expected = "-...";
        String actual = converter.engToMorse(testdata);

        assertEquals(expected, actual);
    }
    @Test
    public void testconMorseToA() {

        Converter converter = new Converter();

        String testdata = ".-";
        String expected = "A";

        String actual = converter.morseToEng(testdata);

        assertEquals(expected, actual);
    }
    @Test
    public void testconAtoMorse() {

        Converter converter = new Converter();

        String testdata = "A";
        String expected = ".-";

        String actual = converter.engToMorse(testdata);

        assertEquals(expected, actual);
    }
    @Test
    public void testconHEJtoMorse() {

        Converter converter = new Converter();

        String testdata = "HEJ";
        String expected = ".... . -.--" ;

        String actual = converter.engToMorse(testdata);

        assertEquals(expected, actual);
    }

}
