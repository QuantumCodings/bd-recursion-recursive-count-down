package com.amazon.ata.recursion.prework;

public class RecursiveCountDown {

    /**
     * This recursive method will return a string consisting of all the integers from the target
     * down to zero. ex: target=3 will return "3210"
     * @param target - this is the number we are counting down from
     * @return - this is a String that has combined all the numbers from target down to 0.
     */
    public static String countdown(int n) {
        if (n == 0) {
            return "0";
        }
        return n + countdown(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(countdown(n)); // Output will be "3210"
    }
}
