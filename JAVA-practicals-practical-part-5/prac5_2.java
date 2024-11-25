import java.util.*;
public class prac5_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner dc = new Scanner(System.in);
        try{
            try{
                System.out.println("enter a number for division");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int result = x/y;
                System.out.println("numbers entered are valid, result is: "+result);
                try{
                    String sy = dc.nextLine();
                    int a = Integer.parseInt(sy);
                    System.out.println("input is an integer: "+a);
                    try{
                        String s = dc.nextLine();
                        System.out.println("string index is in range, requested char is: "+s.charAt(sc.nextInt()));
                        try{
                            int arr[] = {1,2,3,4,5};
                            System.out.println("array index is in bounds, requested index is: "+arr[sc.nextInt()]);
                        }
                        catch(ArrayIndexOutOfBoundsException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    catch(StringIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                }
                catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            } 
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        finally{
            System.out.println("code executed successfully");
        }
        sc.close();
        dc.close();
    }
}