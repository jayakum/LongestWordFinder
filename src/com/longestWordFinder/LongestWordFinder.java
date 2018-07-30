package com.longestWordFinder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class LongestWordFinder {

    private static Logger logger = LogManager.getLogger();

    /**
     * Returns the longest word and it's length from the given input sentence string.
     * If user does not provide any input or provides invalid input, it returns the appropriate message.
     * Assumption: Only letters (a-zA-Z) are considered valid
     *
     * @param input sentence passed as string
     * @return longest word and it's length as String value
     */
    String getLongestWordAndLength(String input) {
        String[] words = input.trim().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        String result, longestWord = null;
        int longestWordLength = 0;

        if (input.length() == 0) {
            result = "Empty Input String";
        } else if (words[0].equals("")) {
            result = "Invalid Input";
        } else {
            for (String word : words) {
                int wordLength = word.length();
                if (wordLength > longestWordLength) {
                    longestWord = word;
                    longestWordLength = wordLength;
                }
            }
            result = "Longest Word - " + longestWord + " : Length - " + String.valueOf(longestWordLength);
        }
        return result;
    }


    public static void main(String[] args) {
        logger.info("Please enter input sentence:");
        Scanner scanner = new Scanner(System.in);
        LongestWordFinder longestWordFinder = new LongestWordFinder();
        String result = longestWordFinder.getLongestWordAndLength(scanner.nextLine());
        logger.info(result);
    }
}

