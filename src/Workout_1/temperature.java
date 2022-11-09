package Workout_1;

import java.net.SocketOption;
import java.util.Scanner;

public class temperature {

    public static void main(String[] args){

        System.out.println("Enter Workout_1.temperature in fahrenheit : ");
        Scanner input = new Scanner(System.in);
        float fahrenheit = input.nextFloat();

        System.out.println("Temperature in celsius : "  + Math.round(fahrenheit-32)/1.8);
    }


}
