
import java.util.*;
public class prac2_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("enter choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Length of string is: ");
                System.out.println(str.length());
                break;
            case 2:
                System.out.println("String of lowercase is: ");
                System.out.println(str.toLowerCase());
                break;
            case 3:
                System.out.println("String in uppercase is: ");
                System.out.println(str.toUpperCase());
                break;
            case 4:
                System.out.println("Reverse of string is: ");
                for(int i=str.length()-1;i>=0;i--){
                    System.out.print(str.charAt(i));
                }
            case 5:
                System.out.println("Sorted string is: ");
                char arr[] = str.toCharArray();
                Arrays.sort(arr);
                System.out.println(arr);

            default:
                break;
        }
        System.out.println("This Practical is made by 23CS019- Kushal Desai ");
    }
}
