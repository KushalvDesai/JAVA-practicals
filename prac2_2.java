import java.util.*;
public class prac2_2 {
    static int array_count(int[] arr)
    {
        int c = 0;
        int len = arr.length;
        for(int i = 0;i < len;i++){
            if(arr[i] == 9){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int len = n.nextInt();
        int[] arr = new int [len];
        for(int i = 0;i < len; i++){
            arr[i] = n.nextInt();
        }
        int result = array_count(arr);
        System.out.println(result);
        System.out.println("This Practical is made by 23CS019- Kushal Desai ");
    }
}
