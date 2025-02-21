package no.hvl.dat102.innlevering2;

public class MergeSort {
    public static void mergeSort(int[] a) {
        if (a.length < 2) return;
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
        
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
        
        mergeSort(left);
        mergeSort(right);
        
        merge(a, left, right);
    }

    private static void merge(int[] a, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
