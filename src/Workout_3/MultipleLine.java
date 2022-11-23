package Workout_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleLine {

    public static void main(String[] args) throws FileNotFoundException {
        int line = 0, vowel = 0, word = 0;
        File file = new File("C:\\Users\\salooma\\IdeaProjects\\Workout-1\\src\\Workout_3\\demo1");
        Scanner input = new Scanner(file);

        ArrayList<String[]> words = new ArrayList<String[]>();
        while (input.hasNextLine()){

            line++;
            String str = input.nextLine();
            words.add(str.split(" "));

        }

        for (String[] wrd : words) {

                word = word + wrd.length;
                for (String str : wrd) {
                    for (int i = 0 ; i < str.length(); i++){
                        char c = str.charAt(i);
                        if ( c== 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            vowel++;
                    }

                }


            }
        }
        System.out.println("Number of lines : " + line);
        System.out.println("Number of Words : " + word);
        System.out.println("Number of vowels : " + vowel);
    }
}
