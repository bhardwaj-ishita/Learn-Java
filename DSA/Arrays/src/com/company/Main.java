package com.company;

public class Main {
    public static void main(String[] args) {
        int[] array = {20,35,7,-15,55,1,-22};

        BubbleSort.mybubblesort(array);
        System.out.print("\n");

        BubbleSort.bubblesort(array);
        System.out.print("\n");

        InsertionSort.insertionsort(array);
        System.out.print("\n");

        InsertionSort.myinsertionsort(array);
        System.out.print("\n");

        SelectionSort.selectionsort(array);
        System.out.print("\n");

        ShellSort.shellsort(array);
        System.out.print("\n");

        // if mergeSort method is not static
        //MergeSort mergeSort = new MergeSort();
        // mergeSort.mergesort(parameters);
        // if mergeSort method is static
        MergeSort.mergesort(array, 0, array.length);
        for(int x: array) System.out.println(x);
        System.out.print("\n");

        QuickSort.quicksort(array, 0, array.length);
        for(int x: array) System.out.println(x);
        System.out.print("\n");

        int[] newArray = {2,5,9,8,2,8,7,10,4,3};
        CountingSortOptimized.countingSort(newArray, 1, 10);
        for(int x:newArray) System.out.println(x);

    }
}
