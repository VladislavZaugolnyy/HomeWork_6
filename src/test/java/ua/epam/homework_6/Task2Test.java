package ua.epam.homework_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {
    Task2 task2 = new Task2();

    int[] integers = {1, 2, 3, 1};
    int k = 3;

    @Test
    public void shouldReturnTrueExample1() {
        assertEquals(true, task2.matchCondition(integers, k));
    }

    int[] integers2 = {1, 0, 1, 1};
    int k2 = 1;

    @Test
    public void shouldReturnTrueExample2() {
        assertEquals(true, task2.matchCondition(integers2, k2));
    }

    int[] integers3 = {1, 2, 3, 1, 2, 3};
    int k3 = 2;

    @Test
    public void shouldReturnFalseExample3() {
        assertEquals(false, task2.matchCondition(integers3, k3));
    }
}
