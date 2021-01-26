package com.company;

public class QuickSort {
    public static void quicksort(int[] input, int start, int end) {
        //base condition
        if(end - start < 2)
            return;

        int pivotIndex = partition(input, start, end);
        quicksort(input, 0, pivotIndex);
        quicksort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int i = start;
        int j = end;
        int pivot = input[start];
        //iteration
        while(i < j) {
            //Left to right looking for smaller elements
            while(i < j && input[--j] >= pivot);
            //empty body bcoz just need to decrement j
            //decrement until we find element less than the pivot
            //when the while loop gets completed and it falls out, we write the condn i<j;hence it will only be applicable until true
            if(i < j)
                input[i] = input[j];

            //Right to left looking for larger elements
            while(i < j && input[++i] <= pivot);//empty body bcoz just need to increment i
            if(i < j)                           //increment until we find an element greater than the pivot
                input[j] = input[i];
        }
        input[j] = pivot;
        return j;
    }
}
