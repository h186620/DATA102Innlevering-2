package no.hvl.dat102.innlevering2;

public class InsertionSort {
    public static void insertionSort(Integer[] arr) {

        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[0];
        arr[0] = temp;


        for (int i = 1; i < arr.length; i++) {
            int tempValue = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > tempValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tempValue;
        }
    }
}
