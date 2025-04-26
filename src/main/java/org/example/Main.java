package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     ArrayPrac arrayPrac = new ArrayPrac();
     int[] arr = {10, 4, 3, 50, 23};
     int[] arr1 = {1,2,3,4,5,6};
     int[] arr2 = {1,4,4,5,5,8,8,9,10,10};
     System.out.println("Maximum value : " +arrayPrac.maxnum(arr));
     System.out.println("Sum of elements : " +arrayPrac.sumNum(arr));
     System.out.println("Reversed elements : " + Arrays.toString(arrayPrac.rev(arr)));
     System.out.println("The array " +Arrays.toString(arr1)+ " is " + (arrayPrac.checkSorted(arr1) ? "sorted" : "not sorted"));
     System.out.println("The array " +Arrays.toString(arr)+ " is " + (arrayPrac.checkSorted(arr) ? "sorted" : "not sorted"));
    System.out.println("The array length after duplication removed : " +arrayPrac.RemDup(arr2));
    System.out.println("The second largest number in the array : " +arrayPrac.secondLargest(arr));
    }
}