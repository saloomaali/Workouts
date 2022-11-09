package Workout_1;

import java.util.Scanner;

public class triangle {

    public static void main(String[] args){

        System.out.println("Enter the limit :");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        if (limit==0){
            System.out.println("Please enter a number grater than '0' ");
        }

        for (int i = 1; i<=limit; i++){

            for (int j=1; j<=i; j++){
                System.out.print(i);

            }
            System.out.println();

        }
    }

}
