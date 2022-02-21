package org.anirudha.practice.leetcode.arrays.utils;

public final class PrintUtils {

    private static final String COMMA_SPACE = ", ";

    private PrintUtils() {
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + COMMA_SPACE);
        }
    }

    public static void printArray(String[] arr) {
        for (String i : arr) {
            System.out.print(i + COMMA_SPACE);
        }
    }

    public static void printArray(long[] arr) {
        for (long i : arr) {
            System.out.print(i + COMMA_SPACE);
        }
    }

    public static void printArray(double[] arr) {
        for (double i : arr) {
            System.out.print(i + COMMA_SPACE);
        }
    }

    public static void printArray(char[] arr) {
        for (char i : arr) {
            System.out.print(i + COMMA_SPACE);
        }
    }
}
