public class Date {
    private int day, month, year;
    Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String displayDate(){
        String date;
        date = getDay() + "/" + getMonth() + "/" + getYear();
        return date;
    }
}
