import java.util.*;
public class prac3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choice 1 for square, 2 for circle and 3 for triangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                area square = new area();
                break;
            case 2:
                System.out.print("enter radius of cicrle: ");
                area circle = new area(sc.nextDouble());
                break;
            case 3:
                area triangle = new area(sc.nextInt(), sc.nextInt());
            default:
                break;
        }
        System.out.println("This practical is made by 23CS019 - Kushal Desai");
    }
}
class area{
    public 
        area(){     //square
            int ar = 100;
            System.out.println("Area of square is: "+ar);
        }
        area(double r){
            double ar = 3.14 * r * r;
            System.out.println("Area of circle is: "+ar);
        }
        area(int l, int b){
            double ar = 0.5*l*b;
            System.out.println("Area of triangle is: "+ar);
        }
}