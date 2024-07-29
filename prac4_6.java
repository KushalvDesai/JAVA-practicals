public class prac4_6 {
    public static void main(String[] args){
        Q q = new Q();
        q.displayp1();
        q.displayp2();
    }
}

interface P1{
    String p1 = "P1";
    void displayp1();
}
interface P2{
    String p2 = "P2";
    void displayp2();
}
interface P12 extends P1,P2{

}
class Q implements P12{
    public void displayp1(){
        System.out.println("Method from class P1: "+p1);
    }
    public void displayp2(){
        System.out.println("Method from class P2: "+p2);
    }
}