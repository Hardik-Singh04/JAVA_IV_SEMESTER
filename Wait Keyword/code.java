/* Write a class Customer having balance as a property and void 
withdrawal(int amount), and void deposit(int amount) as instance methods. 
There are two threads, the first thread wants to withdrawal some amount and 
second thread wants to deposit some amount. Apply inter thread communication 
where, if withdrawal amount is higher than current balance then first thread will 
wait for second thread to deposit then resume the withdrawal.*/
class Customer
{
int balance=0;
public synchronized void withdrawl(int amount)
{
System.out.println("Going to withdraw : ");
if(balance<amount)
{
System.out.println("Low balance...... kindly Wait.....");
try
{
wait();
}
catch(Exception e)
{
System.out.println(e);
}
}
balance-=amount;
System.out.println("New balance : "+balance);
}
public synchronized void deposit(int balance)
{
System.out.println("Going to Deposit...");
this.balance+=balance;
System.out.println("Balance : "+this.balance);
notify();
}
}
class Mythread extends Thread
{
Customer a;
Mythread(Customer a)
{
this.a=a;
}
public void run()
{
a.withdrawl(1000);
}
}
class Mythread1 extends Thread
{
Customer a;
Mythread1(Customer a)
{
this.a=a;
}
public void run()
{
a.deposit(2000);
}
}
public class ThreadComm
{
public static void main(String args[])
{
Customer d=new Customer();
Mythread t=new Mythread(d);
t.start();
Mythread1 t1=new Mythread1(d);
t1.start();
}
}

 
