import java.util.Scanner;

public class perfectSquare {

    public static void main(String[] args){

        System.out.println("Enter the boundary values : ");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int num1 = input1.nextInt();
        int num2 = input2.nextInt();

        for(int i = num1; i <= num2; i++){
            if (Math.sqrt(i) % 1 == 0){
                System.out.println(i);
            }

        }
        }
}

