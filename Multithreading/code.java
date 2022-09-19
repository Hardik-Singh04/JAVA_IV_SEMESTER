/* Write a multithreaded program where three threads are there 
and printing the numbers from 1 to 10 concurrently.*/
class A extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("From thread A : "+i);
}
}
}
class B extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("From thread B : "+i);
}
}
}
class C extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("From thread C : "+i);
}
}
}
public class Mythread
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
try
{
a.join();
}
catch(Exception e)
{
System.out.println(e);
}
a.start();
b.start();
c.start();
}
}
