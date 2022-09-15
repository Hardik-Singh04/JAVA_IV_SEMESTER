/* Create a package pack1 having one class C1 and one interface I1. 
Class C1 has two methods int sum(int, int) and int sub(int, int). The I1 has one 
method int division(int, int). Create another package pack2 having class C2. 
Reuse C1 and I1 in C2 and show the results. Note: Use appropriate Access 
Modifiers as required.*/
package P1;
public class C1
{
public int sum(int a,int b)
{
return a+b;
}
public int sub(int a,int b)
{
return a-b;
}
}
