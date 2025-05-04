package org.example;

public class MathsPrac01 {

    /*Count the number of digits in a number.*/

    public int countDigit(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;

        while (n != 0) {
            count += 1;

            n = n / 10;
        }

        return count;
    }

    /* Reverse a number
    *
    * Input: x = -120

Goal: Return the reversed integer: -21

But if the result overflows 32-bit signed int range ([-2³¹, 2³¹ - 1]), return 0.

*/
    public int reverseInteger(int n) {
        int rev = 0;
        int digit = 0;
        if (n == 0) {
            return 0;
        }

        while (n != 0) {
            digit = n % 10;

            // Check for overflow BEFORE adding the digit
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE) {
                return 0;
            }

            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    /*Check if an Integer is a Palindrome
Input: x = 1221
Output: true (because it reads the same forwards and backwards) */

    public boolean palindrome(int n) {
        int rev = 0;
        int digit;
        int temp = n;

        if (n < 0) {
            return false;
        }


        while (n != 0) {
            digit = n % 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return false;
            }

            rev = rev * 10 + digit;

            n = n / 10;
        }

        return temp == rev;
    }

    /* Problem: Find GCD of Two Numbers
Input: a = 36, b = 60
Output: 12 (because 12 is the greatest number that divides both)

💡 Hint: Use Euclidean Algorithm
The idea:
GCD(a, b) = GCD(b, a % b)
Keep doing this until b becomes 0. Then a is your answer.*/

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /*Problem: Find LCM of Two Numbers
Input: a = 12, b = 18
Output: 36

💡 Hint / Magic Formula
📌 LCM(a, b) = (a × b) / GCD(a, b)

This means:

First, find GCD of a and b (you just learned that)

Multiply a and b

Divide by the GCD — that's your LCM ✅

*/

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    /*Problem: Check if a Number is Prime
Input: n = 29
Output: true (since 29 is a prime number)

💡 Hint:
A number is prime if it's greater than 1 and has no divisors other than 1 and itself.

You only need to check divisibility from 2 up to √n (square root of n)

*/

    public boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*Prime Factorization of a Number
✅ Problem Statement:
Given an integer n, print all its prime factors.

Example:

Input: n = 60

Output: 2 2 3 5
(Because 60 = 2 × 2 × 3 × 5)

💡 Hint:
Start dividing n by 2 while it's divisible (this handles all even factors).

Then try all odd numbers from 3 up to √n.

If at the end, n > 1, then n itself is a prime factor.

This avoids checking every number up to n.

     */

    public void printPrimeDiv(int n) {

        if(n <= 1){
            System.out.print("No Prime factors");
            return;
        }

        while( n % 2 == 0){
            System.out.print("2 ");
            n /= 2;
        }

        for(int i=3;i<=Math.sqrt(n);i += 2){
            while(n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }

        if(n > 1){
            System.out.print(n);
        }
    }
    /*Count All Divisors of a Number
Input: n = 36
Output: 9
Why?
The divisors are: 1, 2, 3, 4, 6, 9, 12, 18, 36 → total = 9

💡 Hint:
A divisor always comes in pairs: if i divides n, then n/i also divides n.

You only need to loop from 1 to √n.

If i * i == n, count it once (don’t double count square roots).

*/


    public int CountDivisors(int n){
        System.out.println();
        int count = 0;

        for(int i=1;i<= Math.sqrt(n);i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    /*Problem: Sum of Digits Until a Single Digit (Digital Root)
Input: n = 9875
Process:

9 + 8 + 7 + 5 = 29

2 + 9 = 11

1 + 1 = 2
Output: 2 ✅

💡 Hint:
Use a loop (or recursion) to keep summing the digits.

Stop when the number is a single digit (n < 10).

     */

    public int SumDigits(int n) {

        while (n >= 10) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n = n / 10;
            }
             n = sum;
        }
        return n;
    }


    /*Problem: Count Trailing Zeros in Factorial
Input: n = 100
Output: 24
Why? 100! (factorial of 100) ends with 24 zeros

❓ What Are Trailing Zeros?
Trailing zeros come from multiplying by 10, and:

✅ 10 = 2 × 5

So in a factorial, every time you have a pair of (2 × 5), you get a trailing zero.

💡 Hint:
Factorials have more 2s than 5s, so the number of 5s determines the number of zeros.

Count how many times 5, 25, 125, etc., divide n.*/

    public int countTrailingZero(int n){
            int count = 0;

            for(int i=5;n/i >= 1;i *=5) {
                count += n / i;

            }
            return count;
            }
    }

