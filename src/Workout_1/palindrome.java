package Workout_1;

import java.util.Scanner;

public class palindrome {

    public static void isPalindrome(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("Given string is Workout_1.palindrome ");
        }
        else {
            System.out.println("Given string is not Workout_1.palindrome");
        }
        }

    public static void main(String[] args){
        System.out.println("Enter the string ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        isPalindrome(str.toLowerCase());

    }
}
