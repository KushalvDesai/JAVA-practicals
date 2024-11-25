import java.util.*;
public class prac3_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter real and imaginary part of 1st complex number: ");
        Complex a = new Complex(sc.nextInt(),sc.nextInt());
        System.out.println("enter real and imaginary part of 2st complex number: ");
        Complex b = new Complex(sc.nextInt(), sc.nextInt());
        String Sum = a.complexSum(b), Difference = a.complexDifference(b);
        int Product = a.complexProduct(b);
        System.out.println("sum of given complex numbers is: "+Sum);
        System.out.println("difference of given complex numbers is: "+Difference);
        System.out.println("product of given complex numbers is: "+Product);
        sc.close();
    }
}
