package main;

public class SimpleNumber {
    public static void main(String[] args) {
        int start = 2;
        int end = 100;

        for (int i = start; i < end; i++) {
            boolean isPrime = true;
            for (int j = start; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("PRIME: " + i);
            }
        }
    }
}
