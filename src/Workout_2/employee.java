package Workout_2;

import java.util.Scanner;

public class employee {

    private String name;
    private int empId;
    String result = null;
    float ass1, ass2, ass3;

    employee(){
        System.out.println("Enter employee details");

        System.out.println("Name : ");
        Scanner sc1 = new Scanner(System.in);
        name = sc1.next();

        System.out.println("EmpId");
        Scanner sc2 = new Scanner(System.in);
        empId = sc2.nextInt();

        System.out.println("ass1");
        Scanner sc3 = new Scanner(System.in);
        ass1 = sc3.nextInt();

        System.out.println("ass2");
        Scanner sc4 = new Scanner(System.in);
        ass2 = sc4.nextInt();

        System.out.println("ass3");
        Scanner sc5 = new Scanner(System.in);
        ass3 = sc5.nextInt();
    }
    public void display(){
        if(ass1 > 75 && ass2 > 75 && ass3 >75){
            this.result = "Promoted";
        }
        else {this.result = "Demoted";}
        System.out.println("The employee is "+ result);

        float total = this.ass1 + this.ass2 + this.ass3;
        float percentage = (total/300) * 100;
        System.out.println("Total assessment value = " + total+ "\n" +
                "Percentage of employee = " + percentage + "%");
    }

    public static void main(String[] args){
        employee e = new employee();
        e.display();


    }
}
