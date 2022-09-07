/* 3 - Write a program to sum two numbers. Here inputs are provided
through command line argument.*/

import java.util.*;
public class Sum
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println(a+" + "+b+" = "+(a+b));
}
}
