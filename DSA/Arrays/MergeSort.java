package com.company;

public class MergeSort {

    public static void mergesort(int[] input, int start, int end) {
        if(end - start < 2)//base condition
            return;

        //dividing
        int mid = (start + end) / 2;
        mergesort(input, 0, mid);
        mergesort(input, mid, end);
        //in the end index we send the input index 1 greater than required
        //this will send the input array into a recursive function of dividing the array in 1 index sorted arrays
        merge(input, start, mid, end);//sorting and merging
    }

    private static void merge(int[] input, int start, int mid, int end) {
        //OPTIMIZATION 1
        if(input[mid - 1] <= input[mid])
            return;
        /*
        here if the last element in the LEFT array is smaller than the first element in the
        RIGHT array then the whole array couple is already sorted. We won't need them to run through
        the logic unnecessarily
         */

        int i = start;//left index
        int j = mid;//right index
        int tempIndex = 0;//new temporary index pointer
        int[] temp = new int[end - start];//the new index

        //this is until one of the array pointer reaches the end
        while(i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
            //if [i] < [j] then put [i] in temp[temp index] and i++ & tempIndex++
            //else put [j] in temp[tempIndex] and j++ & tempIndex++
            //Condition ? true(do this) : false(do this);
        }

        //when some elements are still left
        /*
        {32,34},{33,35}
        sorting and merging: {32,33,34...} at this point i = mid pt hence the loop is finished
        so 35 is unsorted still. But logically 35 is the largest and is at it's correct position nonetheless
        There instead of going through the unnecessary steps, simply let it be.
        BUT
        {32,35},{33,34}
        sorting and merging: {32,33,34...} This time the left element is 35;largest but not at it's
        required position. Therefore instead of copying it to the temp array. directly copy it to the
        main array.
         */
        //OPTIMIZATION 2
        System.arraycopy(input, i, input, start + tempIndex, mid - i);//for leftover indices
        System.arraycopy(temp, 0, input, start, tempIndex);//for the final array
    }
}
