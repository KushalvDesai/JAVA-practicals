public class synchronization{
    public static void main(String[] args){
        table obj = new table();
        table obj2 = new table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj2);
        t1.start();
        t2.start();
    }
}

class table extends Thread{
    static synchronized public void printTable(int n){
        for(int i=1; i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread{
    table t;
    MyThread1(table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    table t;
    MyThread2(table t){
        this.t = t;
    }
    public void run(){
        t.printTable(6);
    }
}