import java.util.*;
public class prac4_2 {
    public static void main(String[] args){
        Scanner Int = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        Scanner Double = new Scanner(System.in);
        Employee yash = new Employee(string.nextLine(), Double.nextDouble(), string.nextLine(), Int.nextInt(), Int.nextLong(), string.nextLine());
        Manager kushal = new Manager(string.nextLine(), Double.nextDouble(), string.nextLine(), Int.nextInt(), Int.nextLong(), string.nextLine());
        yash.printSalary();
        kushal.printSalary();
        Int.close();
        string.close();
        Double.close();
    }
}
class Member{
    private String name, address;
    private int age;
    private long contact;
    private double salary;
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public long getContact() {
        return contact;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void printSalary(){
        System.out.println("Salary of member is: "+getSalary());
    }
}

class Employee extends Member{
    private String specializaton, position = "Employee";
    Employee(String name, double salary, String address, int age, long contact, String specializaton){
        setAddress(address);
        setAge(age);
        setName(name);
        setSalary(salary);
        setContact(contact);
        setSpecializaton(specializaton);
    }
    public void setSpecializaton(String specializaton) {
        this.specializaton = specializaton;
    }
    public String getSpecializaton(){
        return specializaton;
    }
    public String getPosition(){
        return position;
    }
}

class Manager extends Member{
    private String department, position = "Manager";
    Manager(String name, double salary, String address, int age, long contact, String department){
        setAddress(address);
        setAge(age);
        setName(name);
        setSalary(salary);
        setContact(contact);
        setDepartment(department);
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
}