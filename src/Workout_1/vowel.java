package Workout_1;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        System.out.println("Enter the Character : ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().toLowerCase().charAt(0);

        switch (ch){
            case ('a'):

            case ('e'):

            case ('i'):

            case ('o'):

            case ('u'):
                System.out.println("The given character is Workout_1.vowel ");
                break;



            default: System.out.println("The given character is consonant ");
        }

    }
}