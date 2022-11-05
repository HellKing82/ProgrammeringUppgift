package Inlämning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in så många rader du vill, avsluta med Stopp");
        String InputReader = scan.nextLine();

        Input myInputReader = new Input();


        while (!(InputReader.equals("Stopp"))) {
            myInputReader.setInput(InputReader);
            InputReader = scan.nextLine();
            myInputReader.getLongestWord2(InputReader);

        }

        System.out.println("Programmet avlutas!");
        System.out.println("Antal rader: " + myInputReader.getRows());
        System.out.println("Antalet ord: " + myInputReader.gettotalWords());
        System.out.println("Antal tecken: " + myInputReader.getCount());
        System.out.println("Längsta ord: " + myInputReader.getLongestWord());

    }
}
