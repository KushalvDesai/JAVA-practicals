import java.util.*;
public class prac2_4 {
    static String Double_char(String S){
        String result = "";
        for(int i = 0; i < S.length(); i++){
            result = result + S.charAt(i) + S.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();
        System.out.println(Double_char(str));
        System.out.println("This Practical is made by 23CS019- Kushal Desai ");
    }
}