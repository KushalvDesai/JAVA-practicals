public class prac4_1 {
    public static void main(String[] args){
        child a = new child();
        a.print();
        a.print1();

        parent b = new parent();
        b.print();
    }
}

class parent{
    public void print(){
        System.out.println("this is parent class.");
    }
}
class child extends parent{
    public void print1(){
        System.out.println("this is child class");
    }
}