import java.util.Scanner;
public class prac1_5

{
   public static void main(String []args)
{
int [] product={1,2,3,4,5};
double [] tax={8,12,5,7.5,3};
int [] price={500,450,200,300,1000};
String [] item={"motor","fan","tube","wire","other"};


for(int i=0;i<product.length;i++)
{
  System.out.println("Product  "+ product[i] + item[i] +" has" + tax[i] +" tax");


}
System.out.println("Enter your choice: ");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
System.out.println(n);
double x;

switch(n)
         {
   case 1:
          x=(price[0]) + (price[0]*tax[0]*0.01);
System.out.println("Bill :"+ x);
break;
   case 2:
          x=(price[1]) + (price[1]*tax[1]*0.01);
System.out.println("Bill :"+ x);
break;
   case 3:
          x=(price[2]) + (price[2]*tax[2]*0.01);
System.out.println("Bill :"+ x);
break;
   case 4:
          x=(price[3]) + (price[3]*tax[3]*0.01);
System.out.println("Bill :"+ x);
break;
   case 5:
          x=(price[4]) + (price[4]*tax[4]*0.01);
System.out.println("Bill :"+ x);
break;
}
System.out.println("This Practical is made by 23CS019- Kushal Desai ");
}
}