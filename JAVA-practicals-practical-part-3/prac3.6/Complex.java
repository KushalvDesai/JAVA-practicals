public class Complex{
    private int r, i;
    public void setI(int i) {
        this.i = i;
    }
    public void setR(int r) {
        this.r = r;
    }
    Complex(int r, int i){
        setI(i);
        setR(r);
    }
    public int getI() {
        return i;
    }
    public int getR() {
        return r;
    }
    public String complexSum(Complex temp){
        String Sum = "";
        int tempi, tempr;
        tempr = r + temp.getR();
        tempi = i + temp.getI();
        if(tempi < 0){Sum = tempr + " " + tempi + "i";}
        else{Sum = tempr + " + " + tempi + "i";}
        return Sum;
    }
    public String complexDifference(Complex temp){
        String Difference;
        int tempi, tempr;
        tempr = r - temp.getR();
        tempi = i - temp.getI();
        if(tempi < 0){Difference = tempr + " " + tempi + "i";}
        else{Difference = tempr + " - " + tempi + "i";}
        return Difference;
    }
    public int complexProduct(Complex temp){
        int Product;
        int tempi, tempr;
        tempr = (r*temp.getR()) - (i*temp.getI());
        tempi = (r*temp.getI()) + (i*temp.getR());
        Product = tempr - tempi;
        return Product;
    }
}