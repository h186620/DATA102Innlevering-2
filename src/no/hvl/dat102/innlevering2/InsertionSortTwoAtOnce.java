package no.hvl.dat102.innlevering2;

public class InsertionSortTwoAtOnce {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int tempValueMin = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > tempValueMin) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tempValueMin;

            int tempValueMax = a[i];
            int k = i - 1;

            while (k >= 0 && a[k] < tempValueMax) {
                a[k + 1] = a[k];
                k--;
            }
            a[k + 1] = tempValueMax;
        }
    }
}