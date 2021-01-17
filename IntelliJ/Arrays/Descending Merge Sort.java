package com.company;

public class DescendingMergeSort {

    public static void main(String[] args) {
        int[] array = {3,20,35,7,-15,55,1,-22};
        mergeSort(array, 0, array.length);
	    for(int x: array) System.out.println(x);
    }

    public static void mergeSort(int[] input, int start, int end) {
            if(end - start < 2)//base condition
                return;

            //dividing
            int mid = (start + end) / 2;
            mergeSort(input, 0, mid);
            mergeSort(input, mid, end);
            merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        //OPTIMIZATION 1: here we just have to look if the preceding value is already less then return...
        if(input[mid] <= input[mid - 1])
            return;
        /*
        here if the last element in the LEFT array is larger than the first element in the
        RIGHT array then the whole array couple is already sorted. We won't need them to run through
        the logic unnecessarily
        */

        int i = start;//left index
        int j = mid;//right index
        int tempIndex = 0;//new temporary index pointer
        int[] temp = new int[end - start];//the new index

        //this is until one of the array pointer reaches the end
        while(i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
            //if [i] > [j] then put [i] in temp[temp index] and i++ & tempIndex++
            //else put [j] in temp[tempIndex] and j++ & tempIndex++
            //Condition ? true(do this) : false(do this);
        }

        //when some elements are still left
        /*
        {34,33},{35,32}
        sorting and merging: {35,34,33...} at this point i = mid pt hence the loop is finished
        so 32 is unsorted still. But logically 32 is the smallest and is at it's correct position nonetheless
        There instead of going through the unnecessary steps, simply let it be.
        BUT
        {35,32},{34,33}
        sorting and merging: {35,34,33...} This time the left element is 32; smallest but not at it's
        required position. Therefore instead of copying it to the temp array. directly copy it to the
        main array.
         */
        //OPTIMIZATION 2
        System.arraycopy(input, i, input, start + tempIndex, mid - i);//for leftover indices
        System.arraycopy(temp, 0, input, start, tempIndex);//for the final array
    }
}
