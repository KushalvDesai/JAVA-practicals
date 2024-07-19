public class employee
{
    private String fname, lname;
    private double mSalary;
    public employee(String fname, String lname, double mSalary){
        setFname(fname);
        setLname(lname);
        setmSalary(mSalary);
    }
    public void setFname(String fname){
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setmSalary(double mSalary) {
        if(mSalary > 0){
            this.mSalary = mSalary;
        }
        else{
            this.mSalary = 0;
        }
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public double getmSalary() {
        return mSalary;
    }
    public void raise(double percent){
        mSalary = mSalary*(1 + (percent)/100);
    }
}