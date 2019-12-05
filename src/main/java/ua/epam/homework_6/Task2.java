package ua.epam.homework_6;

public class Task2 {
    public boolean matchCondition(int[] array, int k) {
        if (array.length < 2) {
            return false;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        if (i > j) {
                            if ((i - j) <= k) {
                                return true;
                            }
                        } else if (i < j) {
                            if ((j - i) <= k) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }
}
