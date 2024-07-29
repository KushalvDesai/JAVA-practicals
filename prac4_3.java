import java.util.*;
public class prac4_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of squares: ");
        square[] sq = new square[sc.nextInt()];
        for(int i=0;i<sq.length;i++){
            System.out.print("enter side of square number "+ (i+1) + ": ");
            sq[i] = new square(sc.nextInt());
            System.out.println("area of square number "+ (i+1) +" is "+sq[i].area());
            System.out.println("perimeter of square number "+ (i+1) +" is "+sq[i].perimeter());
            sc.close();
        }
    }
}

class rectangle{
    private int len, br;
    rectangle(int len, int br){
        setBr(br);
        setLen(len);
    }
    public void setBr(int br) {
        this.br = br;
    }
    public void setLen(int len) {
        this.len = len;
    }
    public int getBr() {
        return br;
    }
    public int getLen() {
        return len;
    }
    public int perimeter(){
        int p;
        p = 2*(getBr() + getLen());
        return p;
    }
    public int area(){
        int ar;
        ar = getBr()*getLen();
        return ar;
    }
}

class square extends rectangle{
    private int side;
    public void setSide(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    square(int side){
        super(side, side);
        setSide(side);
    }
}