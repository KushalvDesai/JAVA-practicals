import java.util.Scanner;
public class prac7_4 extends Thread{
    int var;
    public void run(){
        var+=1;
        try{
            sleep(1000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(var);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        prac7_4 t1 = new prac7_4();
        t1.var = sc.nextInt();
        t1.start();
        sc.close();
    }
}