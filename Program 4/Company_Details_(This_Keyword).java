/* 4 - Create class Employee with following attributes and methods
ID, name, department and salary.
The setDetails() method sets the values of ID, name, department and salary.
And showDetails() method shows the value of each field.
Note: (i) Values must be entered through Scanner class.
(ii) Use proper constructor
 (iii) Use “this” reference variable to avoid ambiguity
*/

import java.util.*;
public class Employee
{
int ID;
String name,department;
double salary;
Employee()
{
ID=0;
name="";
department="";
salary=0;
}
void setDetails(int ID,String name,String department,double salary)
{
this.ID=ID;
this.name=name;
this.department=department;
this.salary=salary;
}
void showDetails()
{
System.out.println(“\n\nEmployee’s Details are :”)
System.out.println("ID : "+ID);
System.out.println("Name : "+name);
System.out.println("Department : "+department);
System.out.println("Salary : "+salary);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int ID;
String name,department;
double salary;
System.out.print("Enter Employee’s name :");
name=in.nextLine();
System.out.print("Enter Employee’s ID : ");
ID=in.nextInt();
in.nextLine();
System.out.print("Enter Employee’s department : ");
department=in.nextLine();
System.out.print("Enter Employee’s salary : ");
salary=in.nextDouble();
Employee a=new Employee();
a.setDetails(ID,name,department,salary);
a.showDetails();
}
}
