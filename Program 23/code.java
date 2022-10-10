/*Write a class Display having synchronized void wish(String) 
methods that wishes hello to given string name. Between printing hello and 
provided string name apply delay of 500 milliseconds. Suppose multiple threads 
are there and they are trying to access this wish() method concurrently on 
different objects then irregular output will be there. Write this application in 
such a way so that output becomes regular.*/
class Display
{
public static synchronized void wish(String s)
{
for(int i=0;i<10;i++)
{
System.out.print("Hello :");
try
{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(s);
}
}
}
class Mythread extends Thread
{
Display a;
String name;
Mythread(Display a,String name)
{
this.a=a;
this.name=name;
}
public void run()
{
a.wish(name);
}
}
public class StartSync
{
public static void main(String args[])
{
Display d=new Display();
Display d1=new Display();
Mythread t=new Mythread(d,"Hardik");
t.start();
Mythread t1=new Mythread(d1,"Rahul");
t1.start();
}
}

