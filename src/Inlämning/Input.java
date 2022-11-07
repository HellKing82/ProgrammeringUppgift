package Inlämning;

public class Input {

    private int Count;
    String Longest;
    int Rows;
    int Words;


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

        String[] NewLongest0 = inputReader.split(" ");

        for (int i = 0; i < NewLongest0.length; i++)
            if (NewLongest0[i].length() > Longest.length()) {

                Longest = NewLongest0[i];
            }

        Longest = getLongestWord();

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

}