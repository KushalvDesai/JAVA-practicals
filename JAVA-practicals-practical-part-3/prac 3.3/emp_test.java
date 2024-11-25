import java.util.*;
//prac 3.3
public class emp_test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter details of employee 1: ");
        employee emp1 = new employee(sc.nextLine(), sc.nextLine(), dc.nextDouble());
        System.out.println("Enter details of employee 2: ");
        employee emp2 = new employee(sc.nextLine(), sc.nextLine(), dc.nextDouble());
        System.out.println("\n\n----------Employee 1----------");
        System.out.println("name: "+emp1.getFname()+" "+emp1.getLname());
        System.out.println("monthly salary: "+emp1.getmSalary());
        System.out.println("\n\n----------Employee 2----------");
        System.out.println("name: "+emp2.getFname()+" "+emp2.getLname());
        System.out.println("monthly salary: "+emp2.getmSalary());
        emp1.raise(10);
        emp2.raise(10);
        System.out.println("\n\nAFTER RAISE\n\n");
        System.out.println("\n\n----------Employee 1----------");
        System.out.println("name: "+emp1.getFname()+" "+emp1.getLname());
        System.out.println("monthly salary: "+emp1.getmSalary());
        System.out.println("\n\n----------Employee 2----------");
        System.out.println("name: "+emp2.getFname()+" "+emp2.getLname());
        System.out.println("monthly salary: "+emp2.getmSalary());
        sc.close();
        dc.close();
    }
}
