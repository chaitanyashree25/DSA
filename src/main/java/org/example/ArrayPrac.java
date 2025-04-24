package org.example;

public class ArrayPrac {

    /* Q1: Find the Largest Element in an Array
📝 Problem Statement:
Write a Java program that takes an integer array and returns the maximum element from it.*/

    public int maxnum(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("The array do not have values");
        }
        int max = arr[0];
        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }

}
