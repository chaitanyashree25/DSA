package org.example;

import java.util.Arrays;

public class ArrayPrac {

    /* Q1: Find the Largest Element in an Array
📝 Problem Statement:
Write a Java program that takes an integer array and returns the maximum element from it.*/

    public int maxnum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array do not have values");
        }
        int max = arr[0];
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    /* Q2: Calculate the Sum of All Elements in an Array
📝 Problem Statement:
Write a Java program to calculate the sum of all elements in an integer array.

*/

    public int sumNum(int[] arr) {
        int sum = 0;
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("There are no elements in the array");
        }
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    /*8 Q3: Reverse an Array
📝 Problem Statement:
    Write a Java program to reverse the order of elements in an integer array./

     */

    public int[] rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;

        System.out.println("Original Array :" + Arrays.toString(arr));
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    /*Q4: Check if an Array is Sorted (Ascending Order)
📝 Problem Statement:
Write a Java method that checks whether the given integer array is sorted in ascending order.

*/

    public boolean checkSorted(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("There are no elements in an array");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /*Q5: Remove Duplicates from a Sorted Array (In-place)
📝 Problem Statement:
Write a Java method to remove duplicates from a sorted integer array.
Return the new length, and modify the input array in-place such
that the first k elements are the unique elements.

*/
    public int RemDup(int[] arr){
      if(arr == null || arr.length == 0){
          return 0;
      }

      int i = 0;

      for(int j=0;j<arr.length;j++){
          if(arr[j] != arr[i]){
              i++;
              arr[i] = arr[j];
          }
          System.out.println(Arrays.toString(arr));
      }
      System.out.println("After the change" +Arrays.toString(arr));
      return i + 1;
    }



    public int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondLar = Integer.MIN_VALUE;
        if(arr ==  null || arr.length < 2){
            throw new IllegalArgumentException("Array must have atleast two elements");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secondLar = max;
                max = arr[i];
            }else if(arr[i] > secondLar && arr[i] != max){
                secondLar = arr[i];
            }
        }
        return secondLar;
    }
}
