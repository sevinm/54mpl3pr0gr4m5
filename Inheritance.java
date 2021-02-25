import java.util.Scanner;
class employee{
    public String name;
    public int age, number,salary;
    void printsalary()
    {
        System.out.println("salary:"+ salary);
    }
}
class officer extends employee{
    String specialization;
}
class manager extends employee{
    String department;
}
public class emp{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        officer o = new officer();
        System.out.println("enter name");
        o.name = sc.nextLine();
        System.out.println("enter age");
        o.age = sc.nextInt();
        System.out.println("enter number");
        o.number = sc.nextInt();
        System.out.println("enter salary");
        o.salary = sc.nextInt();
        System.out.println("enter specialization");
        o.specialization = sc.nextLine();
        System.out.println("The name : "+o.name);
        System.out.println("The age : "+o.age);
        System.out.println("The number : "+o.number);
        System.out.println("The salary : "+o.salary);
        System.out.println("The specialization : "+o.specialization);
        o.printsalary();
        
        manager m = new manager();
        
        System.out.println("enter name");
        m.name = sc.nextLine();
        System.out.println("enter age");
        m.age = sc.nextInt();
        System.out.println("enter number");
        m.number = sc.nextInt();
        System.out.println("enter salary");
        m.salary = sc.nextInt();
        System.out.println("enter department");
        m.department = sc.nextLine();
        System.out.println("The name : "+m.name);
        System.out.println("The age : "+m.age);
        System.out.println("The number : "+m.number);
        System.out.println("The salary : "+m.salary);
        System.out.println("The department : "+m.department);
        m.printsalary();
    }
}
