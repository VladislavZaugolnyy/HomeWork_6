package ua.epam.homework_6;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    private MyHashMap myHashMap = new MyHashMap();

    @Test
    public void shouldReturnWhatWasPutIn() {
        myHashMap.put(1, 1);

        Assert.assertEquals(1, (int) myHashMap.get(1));
    }

    @Test
    public void shouldReturnWhatWasPutIn2() {
        myHashMap.put(2, 2);

        Assert.assertEquals(2, (int) myHashMap.get(2));
    }

    @Test
    public void shouldRemoveElementAndReturnMinusOne() {
        myHashMap.remove(2);

        Assert.assertEquals(-1, (int) myHashMap.get(2));
    }

    @Test
    public void checkForBeingNotNull() {
        Assert.assertNotNull(myHashMap);
    }
}
