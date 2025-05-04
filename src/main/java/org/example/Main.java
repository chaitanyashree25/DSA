package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    MathsPrac01 mathsPrac01 = new MathsPrac01();
    /*Count the number of digit*/
    System.out.println("The number of digits :" +mathsPrac01.countDigit(345261));//correct
        System.out.println("The number of digits :" +mathsPrac01.countDigit(0));//Edge case

        /*Reverse the integer*/
        System.out.println("The reverse of the number:" +mathsPrac01.reverseInteger(123));

        /*Check if its palindrome*/

        boolean result = mathsPrac01.palindrome(121);
        if(result == true){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }

        /*To find gcd*/
        System.out.println("GCD of " + 60 + " and " +36+ " is " +mathsPrac01.gcd(60,36));

        /* To find lcm */

        System.out.println("LCM of " + 12 + " and " +18+ " is " +mathsPrac01.gcd(12,18));

        /*Check if the number is prime */

        if(mathsPrac01.checkPrime(13)){
            System.out.println("It is Prime");
        }else{
            System.out.println("It is not Prime");
        }

        /* PRint the prime divisors */

        mathsPrac01.printPrimeDiv(60);

        /*Count number of divisors */

        System.out.println(mathsPrac01.CountDivisors(36));

        /*Sum of Digits Until a Single Digit (Digital Root)*/

        System.out.println("Sum :" +mathsPrac01.SumDigits(9875));

        /* Trailing zero*/

        System.out.println("Trailing Zeros :" +mathsPrac01.countTrailingZero(100));



    }




}