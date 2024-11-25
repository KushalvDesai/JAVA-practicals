public class prac4_5{
    public static void main(String[] args){
        Degree a = new Degree();
        Undergrad b = new Undergrad();
        Postgrad c = new Postgrad();
        a.display();
        b.display();
        c.display();
    }
}

class Degree{
    public void display(){
        System.out.println("I got a degree!");
    }
}
class Undergrad extends Degree{
    public void display(){
        super.display();
        System.out.println("I am an Undergraduate!!");
    }
}
class Postgrad extends Degree{
    public void display(){
        super.display();
        System.out.println("I am a Postgraduate!!");
    }
}