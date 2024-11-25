import java.util.*;

public class prac2_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "CHARUSAT University";
        System.out.print("enter choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Length of string is: ");
                System.out.println(str.length());
                break;
            case 2:
                String s = str.replace( 'H', 'N');
                System.out.println(s);
                break;
            case 3:
                System.out.println("String in uppercase is: ");
                System.out.println(str.toUpperCase());
                break;
            case 4:
                System.out.println(str.substring(0,8));
                break;
            default:
                break;
        }
        System.out.println("This Practical is made by 23CS019- Kushal Desai ");
    }
}
