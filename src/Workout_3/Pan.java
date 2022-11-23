package Workout_3;

import java.util.Scanner;

class InvalidPanException extends Exception{

    InvalidPanException(String msg){

        super(msg);
    }
}
public class Pan {
    public static void main(String[] args) {
        System.out.println("enter the pan number");

        Scanner sc = new Scanner(System.in);
        String pan = sc.next();
        System.out.println("Enter the name of card holder");
        String name = sc.next();
         try {
             if (pan.toLowerCase().charAt(4) != (name.toLowerCase().charAt(0))){
                 throw new InvalidPanException("Exception : Invalid pan number");
             }
             else {
                 System.out.println("valid pan card");
             }
         }
         catch (InvalidPanException e){
             System.out.println(e.getMessage());
             System.out.println("this pan card is not valid");
         }
    }

}
