package ua.epam.homework_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandiesTest {
    Candies candies = new Candies();
    int[] kindsOfCandies1 = {1, 1, 2, 2, 3, 3};

    @Test
    public void shouldReturn3() {
        assertEquals(3, candies.sistersCandies(kindsOfCandies1));
    }

    int[] kindsOfCandies2 = {1, 1, 2, 3};

    @Test
    public void shouldReturn2() {
        assertEquals(2, candies.sistersCandies(kindsOfCandies2));
    }

    int[] kindsOfCandies3 = {1, 1, 1, 1, 1, 1, 1, 1};

    @Test
    public void shouldReturn1() {
        assertEquals(1, candies.sistersCandies(kindsOfCandies3));
    }
}
