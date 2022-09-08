/*6 - Apply following functions on the String "Java".
(i) Try to concat "Welcome" and write down your observation.
(ii) Find character at index 1
(iii) Find index of first 'a'.
(iv) Find index of second 'a'
(v) Compare "Java" to "JAVA"
(vi) Compare "Java" to "JAVA" ignoring the case
(vii) Find the index of first 'a' from last*/

import java.util.*;
public class StringLiterals
{
public static void main(String args[])
{
String s1="Java"; 
 String s2="JAVA";
//(i) Try to concat "Welcome" and write down your observation.
 
System.out.println(s1.concat(" Welcome")); //Java Welcome
System.out.println(“1. Concated String : ”+s1); //Java
 /* The string s1 does not get changed, even though it is invoking the 
method concat(),as it is immutable. 
 It only creates another copy of s1 and concat on it and once it it done the 
copy it deleted by the java garbage collector*/
//(ii) Find character at index 1
System.out.println(“2. Character at Index 1 : ”+ s1.charAt(1));
 //character at index 1 is 'a'
//(iii) Find index of first 'a'.
System.out.println(“3.Index of First ‘a’ : ”+s1.indexOf('a'));
 //index of first 'a' = 1
//(iv) Find index of second 'a'
System.out.println(“4.Index of Second 
‘a’ : ”+s1.indexOf('a',s1.indexOf('a')+1)); //index of second 'a' = 3
 
//(v) Compare "Java" to "JAVA"
System.out.println(“5.Comparing "Java" to 
"JAVA" :”+s1.equals(s2)); //false
//(vi) Compare "Java" to "JAVA" ignoring the case
System.out.println(“6.Comparing "Java" to "JAVA" ignoring the 
case : ”+s1.equalsIgnoreCase(s2)); //true
//(vii) Find the index of first 'a' from last
System.out.println(“ 7.Index of first ‘a’ from 
last : ”s1.lastIndexOf('a')); 
 //index of first 'a' from last = 3
}
}
