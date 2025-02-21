package no.hvl.dat102.innlevering2;

import java.util.Random;

public class SortTid {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 32000; 
        Integer[] arr = new Integer[n];
        
      
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt();
        }
        

        long startTime = System.nanoTime();
        InsertionSort.insertionSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Insertion Sort: " + (endTime - startTime) / 1000000 + " ms");


    }
}
