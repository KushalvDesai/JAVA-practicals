import java.util.*;
public class prac4_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sign stopSign = new sign();
        System.out.print("choose circular sign or rectangular sign: ");
        String choice = sc.nextLine();
        if(choice == "c"){
            stopSign.createCirc(sc.nextLine());
        }
        else if(choice == "r") {
            stopSign.createRec(sc.nextLine());
        }
        sc.close();
    }
}

interface rectangle{
    int length=5, breadth=10;
    String rcolor = "white";
    void createRec(String t);
}
interface circle{
    public int radius=10;
    String ccolor="red";
    void createCirc(String t);
}

interface shape extends circle,rectangle{
    
}

class sign implements shape{
    String text;
    public void createRec(String t){
        setText(t);
        System.out.println("Size of sign is: "+length+" "+breadth);
        System.out.println("color of sign is: "+rcolor);
        System.out.println("text on sign is: "+getText());
    }
    public void createCirc(String t){
        setText(t);
        System.out.println("Size of sign is: "+radius);
        System.out.println("color of sign is: "+ccolor);
        System.out.println("text on sign is: "+getText());
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
