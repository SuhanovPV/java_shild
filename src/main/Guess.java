package main;

public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'S';
        do {
            System.out.println("Char in A-Z");
            System.out.println("GUESS IT ->");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore!='\n');
            if (ch == answer) {
                System.out.println("CORRECT!");
            } else {
                System.out.print("Sorry, letter is ");
                if (ch < answer) {
                    System.out.println("near to the begin");
                } else {
                    System.out.println("near to the end");
                }
            }
        } while (answer != ch);
    }
}
