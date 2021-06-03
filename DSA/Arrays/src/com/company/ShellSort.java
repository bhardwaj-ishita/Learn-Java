package com.company;

public class  ShellSort {
    public static void shellsort(int[] array) {
        /*
        gap traverses(length/2;must be greater than 0; will decrease as gap/2)
            for two nos which are being compared = j (gap;less than the length;j++)
                so when array[j] > theElement (shift and reduce by gap such that the pointer is now at the index 3 lower)
                j -= gap
         */
        //length counts 1,2,3,...
        //but indexes are from 0,1,2,...
        //hence less than length

        for(int gap = array.length/2; gap > 0; gap /= 2)
        {

            for(int j = gap;j < array.length;j++)//j acts like a pointer of the number we re comparing
            {
                int myElement = array[j];
                int i = j;
                // condition i >= gap should be satisfied first
                while(i >= gap && array[i - gap] > myElement)// i behaves like the traverser
                {
                    array[i] = array[i - gap];
                    i -= gap; // i >= gap is used to back up this line, when index be 6 there will be 2 comparisons, with 3 and 0.
                    //while in other cases there will be only 1 comparison bcoz at that time i < gap.(eg: 1 and 4; 2 and 5 etc)
                }
                array[i] = myElement;
            }

        }
        for(int x: array) System.out.println(x);
    }
}
