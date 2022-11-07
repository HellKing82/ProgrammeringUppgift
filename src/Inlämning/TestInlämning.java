package Inlämning;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TestInlämning {


    @Test

    public void testGetRows0() {

        Input myInput = new Input();

        int actual = myInput.getRows();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test

    public void testGetRows1() {

        Input myInput = new Input();

        myInput.setInput("hej");

        int actual = myInput.getRows();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test

    public void testGetRows2() {

        Input myInput = new Input();

        myInput.setInput("hej");
        myInput.setInput("hej");

        int actual = myInput.getRows();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test

    public void testGetCount0() {

        Input myInput = new Input();


        int actual = myInput.getCount();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test

    public void testGetCount1() {

        Input myInput = new Input();

        myInput.setInput("hej");

        int actual = myInput.getCount();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test

    public void testGetWords() {

        Input myInput = new Input();

        myInput.setInput("hej på dig");

        int actual = myInput.gettotalWords();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test

    public void testGetLongestWord() {

        Input myInput = new Input();

        myInput.setInput("Hej");

        String actual = myInput.getLongestWord();
        String expected = "Hej";

        assertEquals(expected, actual);
    }

    @Test

    public void testGetLongestWord2() {

        Input myInput = new Input();

        myInput.setInput("hej på dig");
        myInput.setInput("hej på dig, mår du bra, jag mår kanonbra ?");

        String actual = myInput.getLongestWord();
        String expected = "kanonbra";

        assertEquals(expected, actual);
    }
}

