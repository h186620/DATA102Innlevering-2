package no.hvl.dat102.innlevering2;

public class InsertionSortOptimised {
    public static void insertionSort(int[] a) {

        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        int temp = a[minIndex];
        a[minIndex] = a[0];
        a[0] = temp;


        for (int i = 1; i < a.length; i++) {
            int tempValueMin = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > tempValueMin) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tempValueMin;

            if (i + 1 < a.length) {
                int tempValueMax = a[i + 1];
                int k = i;
                while (k >= 0 && a[k] < tempValueMax) {
                    a[k + 1] = a[k];
                    k--;
                }
                a[k + 1] = tempValueMax;
            }
        }
    }
}
