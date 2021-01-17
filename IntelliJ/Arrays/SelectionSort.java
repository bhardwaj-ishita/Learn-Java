package com.company;

public class SelectionSort {
    public static void selectionsort(int[] array) {
        //THE SELECTION SORT THEORY
        /*In-place algorithm: as long the additional space created
            has no relations to the number of terms in the array
            the algo remains in-place*/
        //O(n^2)
        //doesn't require as much swapping as bubble sort
        //we only swap once per traversal
        //unstable algorithm

        //THE SELECTION SORT IMPLEMENTATION
        //left to right
        //ascending order

        int i, largest;
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            largest = 0;
            for (i = 1; i <= lastUnsortedIndex; i++) {
                if (array[largest] < array[i]) {
                    largest = i;
                }
            }
            BubbleSort.swap(array,largest,lastUnsortedIndex);//swap the largest and the last element

        }
        for(int x: array) System.out.println(x);


    }
}

