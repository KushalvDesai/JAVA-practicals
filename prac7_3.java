
public class prac7_3{
    public static void main(String[] args) {
        num t1 = new  num();
        t1.start();
    }
} 

class num extends Thread{
    int num;
    public void run(){
        num = (int)(Math.random() * 101);
        System.out.println("Number is: "+ num);
        if(num % 2 == 0){
            square t2 = new square(num);
            t2.start();
        }
        else{
            cube t3 = new cube(num);
            t3.start();
        }
    }
}

class square extends Thread{
    int num;
    square(int num){
        this.num = num;
    }
    public void run(){
        System.out.println(num*num);
    }
}

class cube extends Thread{
    int num;
    cube(int num){
        this.num = num;
    }
    public void run(){
        System.out.println(num*num*num);
    }
}