package Workout_3;
//Define a new exceptions, called ExceptionLineTooShort and ExceptionLineTooLong,
//        that prints out the error message "The input is too long" and "The input is too short". Write
//        a program that reads lines from user and throws an exception of type
//        ExceptionLineTooLong and ExceptionLineTooShort in the case where a string of the file
//        is longer than 10 characters and shorter than 5 characters respectively. Create separate
//        method for the length checking & exception throw and handle the exception appropriately.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ExceptionLineTooShort extends Exception{

    ExceptionLineTooShort(String msg){
        super(msg);
    }
}
class ExceptionLineTooLong extends Exception{

    ExceptionLineTooLong(String msg){
        super(msg);
    }
}
class Lines{

    public static void lengthcheck(String str) throws ExceptionLineTooLong, ExceptionLineTooShort {
            if (str.length() > 10){
                throw new ExceptionLineTooLong("The input is too long");
            } else if (str.length() < 5) {

                throw new ExceptionLineTooShort("The input is too short");
            }
            else {
                System.out.println("The input is correct");
            }
        }


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\salooma\\IdeaProjects\\Workout-1\\src\\Workout_3\\Lines_text");
        Scanner input = new Scanner(file);
        String[] words = input.nextLine().split(" ");
        for(String str : words){
            try{
                Lines.lengthcheck(str);
            } catch (ExceptionLineTooLong | ExceptionLineTooShort e) {

                System.out.println(e.getMessage());

            }
        }
    }
}
