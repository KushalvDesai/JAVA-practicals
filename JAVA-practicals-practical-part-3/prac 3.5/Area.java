public class Area{
    private int length, breadth;
    Area(int length, int breadth){
        setLength(length);
        setBreadth(breadth);
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
    public int returnArea() {
        return (getBreadth()*getLength());
    }
}