public class Emloyee
{
public String name;
private double salary;
public Employee(String empName)
{
    name=empName;
}
 public void setSalary(double empSal)
 {
    salary=empSal;

 }
 public void printEmp()
 {
System.out.println("name :"+ name);
System.out.println("salary :"+ salary);
 }
 public static void main(String args[])
{
    Employee Empne = new Employee("pratik");//object def1
    Empone.setSalary("10,000")
    Empone.printEmp();
}

}