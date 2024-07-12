import java.util.*;
public class prac2_1 {
    static String front_times(String str, int n){
        String s;
        s = "";
        for(int i=0;i<n;i++){
            s = s + str.substring(0, 3);
        }
        return s;
    }
    public static void main(String[] args)
    {
        String str, result;
        Scanner x = new Scanner(System.in);
        str = x.next();
        result = front_times(str, 4);
        System.out.println(result);
        System.out.println("This Practical is made by 23CS019- Kushal Desai ");
    }
}