package com.company;
public class BubbleSort {

    public static void mybubblesort(int[] myArray) {
        //a normal sorting code
        for (int i = 0; i < myArray.length; i++) {
            for (int j = (i + 1); j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    swap(myArray, i, j);
                }
            }
        }
        for (int x : myArray) System.out.println(x);//sorted index
    }

    public static void bubblesort(int[] intArray) {
        //THE BUBBLE SORT ALGORITHM THEORY:
        /* in-place algo: in context of memory, everything is done in the
             same array. (making the unsorted array to a sorted array)
           Big O-notation: O(n^2) quadratic time complexity
           Algorithm degrades quickly */

        //THE BUBBLE SORT ALGORITHM IMPLEMENTATION
        //left to right sorted
        //ascending order

        for(int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex > 0;lastUnsortedIndex--) {
            for(int index = 0;index < lastUnsortedIndex;index++) {
                if(intArray[index] > intArray[index + 1])
                    swap(intArray, index, index = 1);
            }
        }
        for(int x: intArray) System.out.println(x);//sorted index

    }

    public static void swap(int[] array, int i, int j) {
        int c = array[i];
        array[i] = array[j];
        array[j] = c;
    }

}
