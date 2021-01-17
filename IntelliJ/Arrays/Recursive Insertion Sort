package com.company;

public class RecursiveInsertionSort {

    public static void main(String[] args) {
        int[] array = {20,35,7,-15,55,1,-22};
        insertionSort(array, array.length - 1, array[array.length - 1]);
        for(int x: array) System.out.println(x);
    }

    public static void insertionSort(int[] input, int end, int element) {
        if(end == 1)
            return;
        insertionSort(input, end - 1, input[end - 1]);
        int i = end - 1;
        while(i >= 0) {
            if(input[end] < input[i]){
                input[i--] = input[end];
            }
        }
        input[i + 1] = element;
    }
}

