import java.util.Scanner;

public class fibonacci {

     public static int recursion(int n){
         if(n==0){
             return 0;
         }
         else if (n==1 || n==2){
             return 1;
         }
         else {
             return recursion(n-1) + recursion(n-2);
         }
     }
public static void main(String[] args){

         System.out.println("Enter the limit  ");
         Scanner input = new Scanner(System.in);
         int limit = input.nextInt();
         for (int i = 0; i<limit; i++){
             System.out.print(recursion(i) + " ");
    }
}
}
