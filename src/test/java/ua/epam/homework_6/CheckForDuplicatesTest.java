package ua.epam.homework_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckForDuplicatesTest {
    CheckForDuplicates checkForDuplicates = new CheckForDuplicates();
    int[] numbers1 = {1, 2, 3, 4, 5, 1};

    @Test
    public void shouldReturnTrueIfContainsDuplicates() {
        assertEquals(true, checkForDuplicates.checkArrayForDuplicates(numbers1));
    }

    int[] numbers2 = {1, 2, 3, 4, 5, 7};

    @Test
    public void shouldReturnFalseIfDoesNotContainDuplicates() {
        assertEquals(false, checkForDuplicates.checkArrayForDuplicates(numbers2));
    }

    int[] numbers3 = {1};

    @Test
    public void shouldReturnFalseIfLengthLessThan2() {
        assertEquals(false, checkForDuplicates.checkArrayForDuplicates(numbers3));
    }

    int[] numbers4 = {};

    @Test
    public void shouldReturnFalseIfGivenEmptyArray() {
        assertEquals(false, checkForDuplicates.checkArrayForDuplicates(numbers4));
    }

}
