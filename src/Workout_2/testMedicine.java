package Workout_2;

import java.util.Random;

class medicine{
    public void displayLabel(){
        System.out.println("UNICURE INDIA LTD \n" +
                "Bhagwanpur, Uttarakhand ");
    }
}
class tablet extends medicine{

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Store in a cool dry place");
    }
}
class syrup extends medicine{

    @Override
    public void displayLabel(){
        super.displayLabel();
        System.out.println("Shake well before use");
    }

}
class ointment extends medicine{

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("For external use only");
    }
}
public class testMedicine {
    public static void main(String[] args){
        Random random = new Random();
        int n = random.nextInt(1,4);
        switch (n){
            case 1:
                medicine t = new tablet();
                t.displayLabel();
                break;
            case 2:
                medicine s = new syrup();
                s.displayLabel();
                break;
            case 3:
                medicine o = new ointment();
                o.displayLabel();
                break;
        }
    }
}
