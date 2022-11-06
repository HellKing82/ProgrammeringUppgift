package Inlämning;


import java.util.Arrays;
import java.util.Comparator;

public class Input {

    private int Count;
    String Longest;
    int Rows = 0;
    int Words = 0;

    public Input() {
        Count = 0;
        Longest = "";
        Rows = 0;
        Words = 0;

    }

    public void setInput(String inputReader) {
        Rows = Rows + 1;
        Count = Count + inputReader.length();

        String[] WORDS = inputReader.split(" ");
        Words = Words + WORDS.length;

        Longest = getLongestWord2(inputReader);

    }

    public int getRows() {
        return Rows;
    }

    public int getCount() {
        return Count;
    }

    public int gettotalWords() {
        return Words;
    }

    public String getLongestWord() {
        return Longest;
    }

    public String getLongestWord2(String inputReader) {

        String NewLongest = Arrays.stream(inputReader.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        if (NewLongest.length() > Longest.length()) {
            return NewLongest;

        }
        return Longest;
    }
}
