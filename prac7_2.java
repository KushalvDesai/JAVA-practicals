import java.util.Scanner;
public class prac7_2 extends Thread {
    int num,td,lp;
    int[] tdcount;
    public void run() {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        td = sc.nextInt();
        lp = num/td;
        tdcount = new int[td];
        for(int i=0; i<td-1; i++){
            tdcount[i] = lp;
            num-=lp;
        }
        tdcount[td-1] = num;
        sc.close();
        for(int i=0; i<td; i++){
            System.out.println(tdcount[i]);
        }
    }
    public static void main(String[] args) {
        prac7_2 t1 = new prac7_2();
        t1.start();
    }    
}