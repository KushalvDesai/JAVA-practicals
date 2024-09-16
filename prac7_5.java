public class prac7_5 extends Thread{
    public void run(){
        System.out.println("RUN");
    }
    public static void main(String[] args){
        prac7_5 FIRST = new prac7_5();
        System.out.println("orignal name: " + FIRST.getName());
        System.out.println("\norignal priority: " + FIRST.getPriority());
        FIRST.setPriority(3);
        System.out.println("\nnew priority: " + FIRST.getPriority());
        System.out.println("\n=============================\n");
        prac7_5 SECOND = new prac7_5();
        System.out.println("orignal name: " + SECOND.getName());
        System.out.println("\norignal priority: " + SECOND.getPriority());
        SECOND.setPriority(5);
        System.out.println("\nnew priority: " + SECOND.getPriority());
        System.out.println("\n=============================\n");
        prac7_5 THIRD = new prac7_5();
        System.out.println("orignal name: " + THIRD.getName() );
        System.out.println("\norignal priority: " + THIRD.getPriority());
        THIRD.setPriority(7);
        System.out.println("\nnew priority: " + THIRD.getPriority());
    }
}