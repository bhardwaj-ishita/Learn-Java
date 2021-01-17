package com.company;

public class InsertionSort {

    public static void insertionsort(int[] array) {
        //INSERTION SORT THEORY
        //sorting from starting of the array
        //find the smallest word between the adjacent indices and put it in the position at the starting
        //O(n^2)
        //in-place algo
        //stable algo

        //INSERTION SORT IMPLEMENTATION
        int i, newElement;
        for (int firstUnorderedIndex = 1; firstUnorderedIndex < array.length; firstUnorderedIndex++) {
            newElement = array[firstUnorderedIndex];
            for (i = firstUnorderedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        for (int x : array) System.out.println(x);
    }

    public static void myinsertionsort(int[] intArray) {
        //MY VERSION
        int myNewElement;
        for(int myFirstUnorderedIndex = 1;myFirstUnorderedIndex < intArray.length; myFirstUnorderedIndex++) {
            myNewElement = intArray[myFirstUnorderedIndex];
            for(int j = myFirstUnorderedIndex;j > 0;j--) {
                if(myNewElement < intArray[j - 1]) {
                    intArray[j] = intArray[j - 1];
                }
                else {
                    intArray[j] = myNewElement;
                    break;
                }
            }
        }
        for(int x: intArray) System.out.println(x);
    }
}