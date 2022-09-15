/* Create a class “Bank” having method getRateOfInterest(). 
Create child classes as HDFC, SBI and PNB and override getRateOfInterest() 
and return interest rates as 4.0, 4.5 and 5% correspondingly.
Use concept of Upcasting to implement this scenario.*/
//upcasting
import java.util.*;
public class Bank
{
double getROI()
{
return 2.0;
}
public static void main(String args[])
{
Bank a=new Bank();
System.out.println("Bank ROI : "+a.getROI());
a=new Hdfc();
System.out.println("Hdfc ROI : "+a.getROI());
a=new Sbi();
System.out.println("Sbi ROI : "+a.getROI());
a=new Pnb();
System.out.println("Pnb : "+a.getROI());
}
}
class Hdfc extends Bank
{
double getROI()
{
return 4.0;
}
}
class Sbi extends Bank
{
double getROI()
Name : Hardik Singh Roll Number : 21 Section : A
- 32 -
{
return 4.5;
}
}
class Pnb extends Bank
{
double getROI()
{
return 5;
}
}
