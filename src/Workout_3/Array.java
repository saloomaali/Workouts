//. Create a program to get an array size and elements as the input from the user. Get a
//        number from the user and search for the input number in the array and display “Found” or
//        “Not Found” message. Also display the sorted the array. (Note use separate method for
//        operations with necessary Exception handling).






package Workout_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class ExceptionNotFound extends Exception{

    ExceptionNotFound(String msg){
        super(msg);
    }
}
public class Array {

    public static void found(int[] arr) throws ExceptionNotFound{
        int f =0;
        System.out.println("Enter number to search");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i : arr){
            if(i == num){
                f = 1;
            }
        }
        if (f == 1){
            System.out.println("Found");
        }else {
            throw new ExceptionNotFound("Not Found");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter size of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++){;
            try {
                arr[i] = input.nextInt();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);

            }
        }
        try{
            Array.found(arr);
        }catch (ExceptionNotFound e){
            System.out.println(e.getMessage());
        }


        Arrays.sort(arr);
        System.out.println("Elements of sorted array");
        for (int i : arr){
            System.out.println(i);
        }
    }
}
