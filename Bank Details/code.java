/*2 - Write a Java Program to demonstrate the working of a bankingsystem
Instance variables: name, account_no, amount
Instance methods: deposit(), withdraw(), checkBalance(), insert() and display().
Here we can deposit and withdraw amount from our account using deposit() and
withdraw() methods respectively.
The insert() method is to initialize state and display() method is to display state
values.*/

import java.util.*;
public class Account
{
int account_no;
String name;
float amount;
void insert(int account_no,String name,float amount)
{
this.account_no=account_no;
this.name=name;
this.amount=amount;
}
void withdraw(float amount)
{
if(this.amount<amount)
{
System.out.println("Insufficient balance.");
}
else
{
this.amount-=amount;
System.out.println("New balance = "+this.amount);
}
}
void deposit(float amount)
{
this.amount+=amount;
}
