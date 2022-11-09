package Workout_2;

class oneBHK{
    double roomArea;
    double hallArea;
    double price;

    oneBHK(){

        this.roomArea = 0;
        this.hallArea = 0;
        this.price = 0;
    }
    oneBHK(double roomArea, double hallArea, double price){

        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    public void show(){

        System.out.println("roomArea = " + roomArea);
        System.out.println("hallArea = " + hallArea);
        System.out.println("price  = " + price);
    }
}

class twoBHK extends oneBHK{
    double room2Area;

    twoBHK(){
        this.room2Area = 0;
    }
    twoBHK(double roomArea, double hallArea, double price, double room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }
     public void show(){
         super.show();
         System.out.println("room2Area = " + room2Area);
         System.out.println("\n\n");
     }
}

public class flat_Driver {

    public static void main(String[] args){

        twoBHK f1 = new twoBHK(20,40, 6000, 30);
        twoBHK f2 = new twoBHK(10,50, 7000, 40);
        twoBHK f3 = new twoBHK(30,60, 6800, 50);
        f1.show();
        f2.show();
        f3.show();
        double totalAmount = f1.price + f2.price + f3.price;
        System.out.println("Total amount of all flats = " + totalAmount);


    }
}
