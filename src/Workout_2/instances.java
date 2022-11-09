package Workout_2;

public class instances {

    static int created_count = 0;
    static int destroyed_count =0;
    instances(){
        created_count++;
    }
    public static void main(String[] args){
        instances obj1 = new instances();
        instances obj2 = new instances();

        obj1 = null;
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Total instances created " + created_count);
        System.out.println("Total instances destroyed " + destroyed_count);
        System.out.println("live during the program Execution " + (created_count - destroyed_count));
    }
    protected void finalize(){
        destroyed_count++;
    }
}
