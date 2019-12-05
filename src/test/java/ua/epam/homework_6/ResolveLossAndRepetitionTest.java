package ua.epam.homework_6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ResolveLossAndRepetitionTest {
    ResolveLossAndRepetition resolveLossAndRepetition = new ResolveLossAndRepetition();
    int[] array1 = {1, 2, 2, 4};

    @Test
    public void shouldReturnDuplicateAndMissingNumber1() {
        assertArrayEquals(new int[]{2, 3}, resolveLossAndRepetition.findDuplicateAndMissingNumber(array1));
    }

    int[] array2 = {1, 2, 3, 4, 6, 6};

    @Test
    public void shouldReturnDuplicateAndMissingNumber2() {
        assertArrayEquals(new int[]{6, 5}, resolveLossAndRepetition.findDuplicateAndMissingNumber(array2));
    }
}
