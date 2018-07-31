package com.longestWordFinder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LongestWordFinder {

    private static Logger logger = LogManager.getLogger();

    /**
     * Returns the longest words and longest word length from the given input sentence string.
     * If user does not provide any input or provides invalid input, it returns the appropriate message.
     * Assumption: Only letters (a-zA-Z) are considered valid
     * If there are more than one word with maximum length, all words are returned separated by comma (,)
     *
     * @param input sentence passed as string
     * @return longest words and longest word length as String value
     */
    String getLongestWordAndLength(String input) {
        String result, longestWords;
        String[] words = input.trim().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        int longestWordLength = Arrays.stream(words).map(String::length).max(Integer::compareTo).orElse(0);

        if (input.isEmpty()) {
            result = "Empty Input String";
        } else if (longestWordLength == 0) {
            result = "Invalid Input";
        } else {
            List<String> longestWordList = Arrays.stream(words)
                    .filter(word -> word.length() >= longestWordLength)
                    .collect(Collectors.toList());
            longestWords = longestWordList.toString().replaceAll("^.|.$", "");
            result = "Longest Word - " + longestWords + " : Length - " + longestWordLength;
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

