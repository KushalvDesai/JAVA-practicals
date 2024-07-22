import java.util.*;
public class prac3_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        Area rectangle = new Area(sc.nextInt(),sc.nextInt());
        System.out.println("area of rectangle is: "+rectangle.returnArea());
        sc.close();
    }
}