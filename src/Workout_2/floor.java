package Workout_2;

import java.util.Scanner;

class tile{
     float edgeLength;

     tile(){
         System.out.println("Enter edge length of tile");
         Scanner input = new Scanner(System.in);
         edgeLength = input.nextFloat();
     }
}
class floorDimensions {

    double length;
    double width;

    floorDimensions() {
        System.out.println("Enter length and width of floor");
        Scanner l = new Scanner(System.in);
        length = l.nextDouble();
        Scanner w = new Scanner(System.in);
        width = w.nextDouble();
    }

    public void totalTiles(tile t) {
        System.out.println("Total number of tiles = " + (int)(this.length * this.width / (t.edgeLength * t.edgeLength)));
    }
}
public class floor{
    public static void main(String[] args){

        tile t = new tile();
        floorDimensions f = new floorDimensions();

        f.totalTiles(t);
    }
}



