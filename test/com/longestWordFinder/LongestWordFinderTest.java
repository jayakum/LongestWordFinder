package com.longestWordFinder;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class LongestWordFinderTest {

    /**
     * Read the data line by line from the file specified in the given path and add it to the list after processing
     * File path can also be specified in runtime using -DtestDataFilePath command line parameter.
     * In case, file path is not provided in the runtime, it will read the file specified in the code by default, i.e., "resources/data/allTestCases.txt"
     * 'allTestCases.txt' file has data in three parts; Sentence given as input to the method to be tested, expected result and comment (optional), separated by |
     *
     * @return iterator to the list containing test input and expected result
     * @throws IOException if an I/O error occurs reading from the file
     */
    @DataProvider(name = "testCases")
    public Iterator<Object[]> testData() throws IOException {
        final List<Object[]> testInputAndResult = new ArrayList<>();

        for (String line : Files.readAllLines(Paths.get(System.getProperty("testDataFilePath", "resources/data/allTestCases.txt")), StandardCharsets.UTF_8)) {
            String[] parts = line.split("\\|");
            String testInput = parts[0];
            String expectedResult = parts[1];
            testInputAndResult.add(new Object[]{testInput, expectedResult});
        }
        return testInputAndResult.iterator();
    }

    /**
     * Get the longest word and its length from the method under test and validate the result
     * This test will be run for all the test cases one by one as data is provided from the data provider
     *
     * @param expectedResult from data provider, to be compared against the actual result from the method under test
     * @param testInput      from data provider, to be provided as input to the method under test
     */
    @Test(dataProvider = "testCases")
    public void testGetLongestWordAndLength(String testInput, String expectedResult) {
        LongestWordFinder longestWord = new LongestWordFinder();
        assertEquals(longestWord.getLongestWordAndLength(testInput), expectedResult);
    }

}
