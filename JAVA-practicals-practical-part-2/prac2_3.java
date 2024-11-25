import java.util.*;
public class prac2_3 {
    public static void main(String[] args){
        int[] arr = new int[5];
        boolean found = false;
        Scanner s = new Scanner(System.in);
        for(int i=0; i<5; i++){
            arr[i] = s.nextInt();
        }
        String a  = "";
        for(int i=0; i<arr.length; i++){
            a = a + arr[i]; 
        }
        a = a.substring(0,4);
        System.out.println(a);
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '9'){
                found = true;
                break;
            }
        }
        System.out.println(found);
        System.out.println("This Practical is made by 23CS019- Kushal Desai ");
    }
}