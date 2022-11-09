package Workout_2;

import java.util.Scanner;

     class Faculty {

        int facultyId;
        float salary;

    }


    class fullTimeFaculty extends Faculty {
        float basic;
        float allowance;

        public void input1(){
            System.out.println("Enter the inputs for fullTimeFaculty");
            Scanner obj1 = new Scanner(System.in);
            this.facultyId = obj1.nextInt();
            Scanner obj2 = new Scanner(System.in);
            this.basic = obj2.nextInt();
            Scanner obj3 = new Scanner(System.in);
            this.allowance = obj3.nextInt();

            this.salary = basic + allowance;
        }
        public void display1(){
            System.out.println("Salary for the faculty (Id : " + facultyId + ") is " + salary);
        }
    }
    class partTimeFaculty extends Faculty{
        float hour;
        float rate;


        public  void input2(){
            System.out.println("Enter the inputs for partTimeFaculty");
            Scanner obj1 = new Scanner(System.in);
            this.facultyId = obj1.nextInt();
            Scanner obj2 = new Scanner(System.in);
            this.hour = obj2.nextInt();
            Scanner obj3 = new Scanner(System.in);
            this.rate = obj3.nextInt();

            this.salary = hour * rate;
        }
        public void display2(){
            System.out.println("Salary for the faculty (Id : " + facultyId + ") is " + salary);
        }
    }

public class facultyDriver {
    public static void main(String[] args) {
        fullTimeFaculty ff1 = new fullTimeFaculty();
        fullTimeFaculty ff2 = new fullTimeFaculty();
        partTimeFaculty pf1 = new partTimeFaculty();
        partTimeFaculty pf2 = new partTimeFaculty();

        ff1.input1();
        ff2.input1();
        pf1.input2();
        pf2.input2();
        ff1.display1();
        ff2.display1();
        pf1.display2();
        pf2.display2();

    }
}