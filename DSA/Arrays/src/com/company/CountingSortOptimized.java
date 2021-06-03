package com.company;

public class CountingSortOptimized {

    public static void countingSort(int[] array, int min, int max) {
        int[] countingArray = new int[(max - min) + 1];//10 - 1 = 9 + 1 = 10
        for(int countingIndex = 0; countingIndex < countingArray.length; countingIndex++) {
            int num = array[countingIndex];
            countingArray[num - 1]++;
        }

        int j = 0;//j:for arrays index count
        for(int i = min; i <= max; i++){//i:for keeping up with count array's index count
            while(countingArray[i - min] > 0) {//while the count is not zero
                array[j++] = i;
                countingArray[i - min]--;
                //eg: i=2. count[2-1]>0. array[0]=2. count[2-1]-1=2-1=1.
                //we don't jump out of the while loop still because count[i-min] is still greater than 0.
                //i=2. count[2-1]>0. array[1]=2. count[2-1]-1=1-1=0. Out of the loop
                //i=3 and so on...
            }
        }
        //sorting(countingArray, array); Won't be needing another method
    }

    /*
    public static void sorting(int[] countingArray, int[] array){
        int j = 0;
        int i = 0;
        while(i < array.length) JUST TELL THE RANGE OF i IN THE LOOP{
            if(countingArray[i] > 0 ) {
                for(int num = 0;num < countingArray[i];num++){
                    array[j++] = i + 1;
                }
            }
            i++;
       }
     */
}
