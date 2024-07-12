import java.util.Scanner;
public class prac1_6
{
public static void main(String[] args)
{
int rev=0,temp=0;
Scanner sc= new Scanner(System.in);
 System.out.println("Enter the value of number");
 int number=sc.nextInt();
 
while(number!=0)
{
temp=number%10;
rev=(rev*10)+ temp;
number=number/10;
}

System.out.println(rev);
System.out.println("This Practical is made by 23CS019- Kushal Desai ");

}
}