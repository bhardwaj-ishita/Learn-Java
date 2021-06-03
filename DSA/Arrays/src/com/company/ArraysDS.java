package com.company;

import java.util.*;

public class ArraysDS {

    public static void main(String[] args) {
        //my version
	    int[] myArray = {1,2,3,4,5,6,7};
	    for(int x: myArray) System.out.println(x);

	    //extensive version
	    int[] intArray = new int[7];
	    intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        /*
        1. contiguous(simultaneous) block of memory
        2. every element in the array occupies the same memory/space
        3. if array stored at memory address x;
            size of each array is y;
            then the nth element of the array is stored at
            memory address = (x + n * y)
        IF WE KNOW THE INDEX OF AN ELEMENT
        THE TIME TO RETRIEVE ANY ELEMENT IN THE ARRAY IS SAME
        NO MATTER WHERE IT IS IN THE ARRAY

        hence constant time complexity O(1)
        memory efficient and easy to grab an element if index known
        */

        int index = -1;
        for(int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);

        /*
        DISADVANTAGES:
        when we don't know the index but we need to retrieve a given number

        1. the for loop will go on until it hasn't found the number 7
        2. if the number we want to retrieve is at the end of the array
            the big-O complexity will get linear
            because now the index number matters
        3. if i=1000, the loop will go on for 1000 times.
        hence linear time complexity O(n)
        */

        System.out.println(Arrays.binarySearch(intArray, 7));

        /*add an element to an array(we'll have to make a new
        one and add existing elements and then add the new one)
        hence O(n)*/

        /*add element to end of an array which has space
        hence O(1)*/

        /*insert/update an element at a specific index
        hence O(1)*/

        /*delete an element by setting it to null
        hence O(1)*/

        /*delete an element by shifting elements
        hence O(n)*/

    }
}