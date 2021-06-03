package com.company;
import java.util.Arrays;
public class CountingSort {
    public static void main(String[] args) {
        int[] array = {2,5,9,8,2,8,7,10,4,3};
        int[] countingArray = new int[10];
        Arrays.fill(countingArray, 0);
        countingSort(countingArray, array);
        for(int x:array) System.out.println(x);
    }

    public static void countingSort(int[] countingArray, int[] array) {
        for(int countingIndex = 0; countingIndex < countingArray.length; countingIndex++) {
            int num = array[countingIndex];
            countingArray[num - 1]++;
        }

        sorting(countingArray, array);
    }

    public static void sorting(int[] countingArray, int[] array){
        int j = 0;
        int i = 0;
        while(i < array.length) {
            if(countingArray[i] > 0 ) {
                for(int num = 0;num < countingArray[i];num++){
                    array[j++] = i + 1;
                }
            }
            i++;
        }
    }
}
