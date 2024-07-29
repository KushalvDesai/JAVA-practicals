public class prac4_4 {
    public static void main(String[] args){
        B b = new B();
        b.display();
    }
}

class A{
    static int x=0;
    void display(){
        x+=1;
        System.out.println("static var = "+x);
    }
}
class B extends A{
    int x=0;
    void display(){
        x+=5;
        System.out.println("instance variable: "+x);
        int Static = super.x;
        System.out.println("Static variable: "+Static);
        super.display();
    }
}