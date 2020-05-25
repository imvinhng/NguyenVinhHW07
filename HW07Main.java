/*
 * ==========================================
 * CS211, Spring 2020, 5/24
 * Vinh T. Nguyen
 * Homework 07 - Chap 12 EX 2,5,6,8,15
 * Exercise 2 - writeNums(int n) method that prints the n integers starting with 1 in sequential order
 * Exercise 5 - writeBinary(int n) prints the binary representation of integer n
 * Exercise 6 - writeSquares(int n) prints the first n squares seperated by commas,
 * with the odds squares come before the evens
 * Exercise 8 - multiplyEvens(int n) prints the product of the first n even integers
 * Exercise 15 - voweltoEnd(String s) returns the a string with vowels moved to the end,
 * which appears to be in reverse order
 * ==========================================
 */

public class HW07Main {
    public static void main(String[] args) {
        // writeNums(10);
        // writeBinary(24);
        writeSquares(9); //INCOMPLETE
        // System.out.println(multiplyEvens(3)); 
        // System.out.println(vowelsToEnd("beautifully"));


    }
    // Exercise 2 - writeNums(int n) method that prints the n integers starting with 1 in sequential order
    public static void writeNums(int n){
      //throws exception if n < 1
        if (n<1){
            throw new IllegalArgumentException("parameter must be greater or equal to 1");
        }
        //base case
        if(n == 1){
            System.out.print(1);
        } else {
        // recursive case
           writeNums(n-1);
           System.out.print(", "+ n);
        }
    }
    // Exercise 5 - writeBinary(int n) prints the binary representation of integer n
     public static void writeBinary(int n){
        //if n is a negative number (n<0)
        //n = -n
        if (n <0) {
         n = -n;
        }
        //base case
        if(n / 2 == 0){
            System.out.print(n%2);
        } else {
        // recursive case
           writeBinary(n/2);  
           System.out.print(n%2);
        }
     }
     
    //Exercise 6 - writeSquares(int n) prints the first n squares seperated by commas,
    //with the odds squares come before the evens
    //INCOMPLETE
    public static void writeSquares(int n){
       //throws exception if n < 1
        if (n<1)
            throw new IllegalArgumentException("parameter must be greater or equal to 1");
        
        if(n == 1){  //base case
            System.out.print(1);
            return;
        } 
         
        if (n % 2 == 0) {              // recursive case evens
           writeSquares(n-1);
           System.out.print(", "+ n * n); 
        } else {                       //recursive case evens
           System.out.print(n * n + ", ");
           writeSquares(n-1);
        }
    }
    
    // Exercise 8 - multiplyEvens(int n) prints the product of the first n even integers
    public static int multiplyEvens(int n){
      //throws exception if n < 1
        if (n <= 0){
            throw new IllegalArgumentException("parameter must be greater than 0");
        }
        //base case
        if(n == 1){
            return 2;
        } else {
        // recursive case
           return n*(multiplyEvens(1)) * multiplyEvens(n-1);

        }
    }
      // Exercise 15 - voweltoEnd(String s) returns the a string with vowels moved to the end,
      // which appears to be in reverse order
      // I intentionally left the println statement cause it was beautiful, pls don't deduct points
     public static String vowelsToEnd(String s) {
         //base case
         if (s.isEmpty()) {
            return s;
         }
         if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' ){
            //if the first letter of the string is a vowel, stick it to the end
            System.out.println("Current string in Function: " + s);
            return vowelsToEnd(s.substring(1)) + s.charAt(0);
         } else {
            //else that mean the first letter is a consonant, so stick it at front
            System.out.println("Current string in Function: " + s);
            return s.charAt(0) + vowelsToEnd(s.substring(1));
            
         }
     }
    
     
}