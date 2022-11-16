import java.util.Random;

public class Main {

    public static String randomNumber(String in) {
        String number = "";
        Random random = new Random();
        if (in == "TipoA") {
            number += "54";
            for (int i = 1; i <= 8; i++)
                number += Integer.toString(random.nextInt(10));
        } else {
            number += "08";
            for (int i = 1; i <= 8; i++)
                number += Integer.toString(random.nextInt(10));
        }
        return number;
    }

    // Sorting list of numbers using Merge Sort

    // Merging in ascending order
    public static void ascMerge(int[] numberList, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftNumbers = new int[leftSize];
        int[] rightNumbers = new int[rightSize];

        // Filling the left and right array in ascending order
        for (int i = 0; i < leftSize; i++)
            leftNumbers[i] = numberList[left + i];
        for (int i = 0; i < rightSize; i++)
            rightNumbers[i] = numberList[middle + 1 + i];

        // Setting indexes from left and right arrays
        int i, j, k;
        i = 0; j = 0; k = left;

        // Now we place in the main array (leftNumbers) the elements of
        // both partial arrays (leftNumbers and rightNumbers)
        while (i < leftSize && j < rightSize) {
            if (leftNumbers[i] <= rightNumbers[j]) {
                numberList[k] = leftNumbers[i++];
            } else {
                numberList[k] = rightNumbers[j++];
            }
            k++;
        }

        // Adding to numberList the rest of numbers in both arrays
        while (i < leftSize) {
            numberList[k++] = leftNumbers[i++];
        }
        while (j < rightSize) {
            numberList[k++] = rightNumbers[j++];
        }
    }

    // Merging in descending order
    public static void descMerge(int[] numberList, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftNumbers = new int[leftSize];
        int[] rightNumbers = new int[rightSize];

        // Filling the left and right array in ascending order
        for (int i = 0; i < leftSize; i++)
            leftNumbers[i] = numberList[left + i];
        for (int i = 0; i < rightSize; i++)
            rightNumbers[i] = numberList[middle + 1 + i];

        // Setting indexes from left and right arrays
        int i, j, k;
        i = 0; j = 0; k = left;

        // Now we place in the main array (leftNumbers) the elements of
        // both partial arrays (leftNumbers and rightNumbers)
        while (i < leftSize && j < rightSize) {
            if (leftNumbers[i] >= rightNumbers[j]) {
                numberList[k] = leftNumbers[i++];
            } else {
                numberList[k] = rightNumbers[j++];
            }
            k++;
        }

        // Adding to numberList the rest of numbers in both arrays
        while (i < leftSize) {
            numberList[k++] = leftNumbers[i++];
        }
        while (j < rightSize) {
            numberList[k++] = rightNumbers[j++];
        }
    }

    public static void mergeSort(int[] numberList, int left, int right, String order) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(numberList, left, middle, order);
            mergeSort(numberList, middle + 1, right, order);
            if (order == "Asc") {
                ascMerge(numberList, left, middle, right);
            } else {
                descMerge(numberList, left, middle, right);
            }
        }
    }
    public static void sortNumbers (int[] numberList, String order) {
        mergeSort(numberList, 0, numberList.length - 1, order);
    }

    // Method to print elements of a list
    public static void print(int[] numberList) {
        System.out.println("Sorted list:");
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First challenge
        System.out.println(randomNumber("TipoB"));

        // Second challenge
        int[] numbers = {5, 24, -3, 36, 8, 17, 55};
        sortNumbers(numbers, "Asc");
        print(numbers);
        sortNumbers(numbers, "Desc");
        print(numbers);
    }
}