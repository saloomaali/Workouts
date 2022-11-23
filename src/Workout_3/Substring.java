package Workout_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Substring {
    public static ArrayList<String> sub(String str){
        ArrayList<String> arr = new ArrayList();
        for(int i = 0; i < str.length();i++){
            for (int j = i+1; j<str.length()+1;j++){

                arr.add(str.substring(i,j));
            }
        }
        return arr;
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = obj.next();


        for(String s :   sub(str)){
            System.out.println(s);
        }

    }



}
