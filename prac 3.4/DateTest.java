import java.util.*;
public class DateTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date today = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(today.displayDate());
        sc.close();
    }
}