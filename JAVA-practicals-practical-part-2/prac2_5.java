import java.util.*;
public class prac2_5 {
    static String senrev(String str){
        String[] arr = str.split("\\s+");
        String temp = "";
        for(int i=0;i<arr.length;i++){
            for(int j = arr[i].length() - 1;j>=0;j--){
                temp = temp + arr[i].charAt(j);
            }
            arr[i] = temp;
            temp = "";
        }
        String result = "";
        for(int i=0;i<arr.length;i++){
            result = result + arr[i] + " ";
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(senrev(str));
        System.out.println("This Practical is made by 23CS019- Kushal Desai ");
    }
}
