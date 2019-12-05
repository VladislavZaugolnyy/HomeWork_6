package ua.epam.homework_6;

public class ResolveLossAndRepetition {
    public int[] findDuplicateAndMissingNumber(int[] numbers) {
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i + 1) {
                result[0] = numbers[i];
                result[1] = i + 1;
                return result;
            }
        }
        return result;
    }
}
