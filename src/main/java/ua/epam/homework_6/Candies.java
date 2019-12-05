package ua.epam.homework_6;

import java.util.HashSet;

public class Candies {
    public int sistersCandies(int[] candies) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < candies.length; i++) {
            hashSet.add(candies[i]);
        }
        return Math.min(candies.length / 2, hashSet.size());
    }
}
