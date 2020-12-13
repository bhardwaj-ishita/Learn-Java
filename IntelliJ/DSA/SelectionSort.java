package com.company;
import java.util.*;
import  com.company.BubbleSort;

public class SelectionSort {
    public static void main(String[] args) {
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
        int[] array = {20, 35, -15, 7, 55, 1, -22};
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

