import java.util.*;
public class prac5_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            String X = sc.nextLine();
            int x = Integer.parseInt(X);
            String Y = sc.nextLine();
            int y = Integer.parseInt(Y);
            int result = x/y;
            System.out.println("Result = "+result);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Input is not a valid integer");
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by 0 is not allowed");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}
