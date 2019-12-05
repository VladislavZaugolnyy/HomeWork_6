package ua.epam.homework_6;

public class CheckForDuplicates {
    public boolean checkArrayForDuplicates(int[] array) {
        boolean duplicatesPresent = false;
        if (array.length < 2) {
            return duplicatesPresent;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        duplicatesPresent = true;
                        return duplicatesPresent;
                    }
                }
            }
        }
        return duplicatesPresent;
    }
}
